package QQClient;

import QQCommon.Message;
import QQCommon.MessageType;
import QQCommon.User;
import QQCommon.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.HashMap;

/**
 * @author 王凯
 * @version 1.0
 * 该类用于检查登录验证服务，注册账号以及其他各种服务
 */
public class UserClientService {
    private User u = new User();
    private Socket socket;


    public boolean checkLogin(String id,String pwd) throws IOException, ClassNotFoundException {
        u.setUserID(id);
        u.setPassword(pwd);
        socket = new Socket(InetAddress.getLocalHost(),9999);
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        oos.writeObject(u);
        oos.flush();

        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        Message  mes = (Message) ois.readObject();
        if (mes.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)){
            ClientConnectServerThread ccst  = new ClientConnectServerThread(socket);
            System.out.println("启动一个客户端线程(用户"+id+")");
            ccst.start();
            ManageClientConnectServerThread.addClientConnectServerThread(id,ccst);
            return true;
        }else{
            socket.close();
        }
        return false;
    }

    public void getOnlineFriend () throws IOException {
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        message.setSender(u.getUserID());

        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        oos.writeObject(message);
    }

    public void Exit() throws IOException {
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(u.getUserID());
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        oos.writeObject(message);
        System.exit(0);
        System.out.println(u.getUserID()+" 客户端已退出");
    }

    public void privateChat(String id) throws IOException {
        Message message = new Message();
        //设置消息类型
        message.setMesType(MessageType.MESSAGE_COM);
        //设置发送者
        message.setSender(id);
        //设置发送时间
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
       // SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        message.setMesTime(dateTimeFormatter.format(LocalDateTime.now()));
        //设置接收人
        System.out.println("请输入你要发送的对象:");
        String getter = Utility.readString(10);
        message.setGetter(getter);
        //设置发送的内容
        System.out.println("请输入您要发送的内容:");
        String contain = Utility.readString(150);
        message.setContain(contain);

        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        oos.writeObject(message);
        System.out.println(message.getSender()+" 对"+message.getGetter()+"说 : "
                +message.getContain());
    }

    public void groupChat(String id) throws IOException {
        Message message = new Message();
        //设置消息类型
        message.setMesType(MessageType.MESSAGE_GROUP_CHAT);
        //设置发送者
        message.setSender(id);
        //设置发送时间
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        message.setMesTime(dateTimeFormatter.format(LocalDateTime.now()));
        //设置发送的内容
        System.out.println("请输入您要发送的内容:");
        String contain = Utility.readString(150);
        message.setContain(contain);

        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        oos.writeObject(message);
    }
    public void sendFile(String sender,String id,String filePath) throws IOException {
        Message message = new Message();
        message.setSender(sender);
        message.setMesType(MessageType.MESSAGE_SEND_FILE);
        message.setGetter(id);

        String[] split = filePath.split("/");
        message.setFileName(split[split.length-1]);

        FileInputStream fis = new FileInputStream(filePath);
        message.setFile(fis.readAllBytes());
        fis.close();
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        System.out.println("正在发送中......");
        oos.writeObject(message);
        System.out.println("发送文件成功");
    }
}
