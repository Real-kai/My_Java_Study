package QQServer;

import QQCommon.Message;
import QQCommon.MessageType;
import QQCommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

/**
 * @author 王凯
 * @version 1.0
 * 客户服务端的服务 用于验证账户信息 ，注册用户信息...
 */
public class QQServer {
    private ServerSocket serverSocket;
    private static HashMap<String ,User> userList = new HashMap<>();

    static {
        userList.put("100",new User("100","123456"));
        userList.put("200",new User("200","123456"));
        userList.put("300",new User("300","123456"));
        userList.put("至尊宝",new User("至尊宝","123456"));
        userList.put("紫霞仙子",new User("紫霞仙子","123456"));
        userList.put("赤脚大仙",new User("赤脚大仙","123456"));
        userList.put("孙悟空",new User("孙悟空","123456"));
    }

    public boolean checkUser(String id,String pwd){
        if (ManageServerConnectClientThread.isContain(id)){return false;}
        User user = userList.get(id);
        if (user==null){return false;}
        if (!user.getPassword().equals(pwd)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new QQServer();
    }

    public QQServer() throws IOException, ClassNotFoundException {
        serverSocket = new ServerSocket(9999);//监听9999端口
        System.out.println("QQ服务端正在监听9999端口");
        new BackStageThread().start();
        while(true){
        Socket socket = serverSocket.accept();//得到一个socket套接字
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());//创建一个对象输入流 反序列化对象
        User u = (User) ois.readObject();//收到发过来的User对象 进行验证服务

        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        Message message = new Message();
            if (checkUser(u.getUserID(),u.getPassword())){//如果验证成功

            message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);//返回一个登陆成功
            oos.writeObject(message);
            oos.flush();

            ServerConnectClientThread scct = new ServerConnectClientThread(u.getUserID(),socket);//启动一个服务端线程 用来与客服端线程保持通讯
            System.out.println("连接成功! 启动一个服务端线程(用户"+u.getUserID()+")");
            scct.start();

            ManageServerConnectClientThread.addServerConnectClientThread(u.getUserID(),scct);//把线程添加到集合里
        }else {//如果验证失败
            message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);//返回一个登录失败对象
                System.out.println("用户"+u.getUserID()+"  验证失败");
            oos.writeObject(message);
            oos.flush();
            socket.shutdownOutput();

            socket.close();//关闭socket
        }}


    }



}
