package QQClient;

import QQCommon.Message;
import QQCommon.MessageType;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * @author 王凯
 * @version 1.0
 * 该类用于客户端与服务端连接线程后台运行
 */
public class ClientConnectServerThread extends Thread{
    private Socket socket;
    public  boolean loop = true;

    public Socket getSocket() {
        return socket;
    }

    public ClientConnectServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while(loop) {
            try {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();

                if (message.getMesType().equals(MessageType.MESSAGE_RET_ONLINE_FRIEND)){
                    System.out.println("================在线用户列表================");
                    String s = message.getContain();
                    String[] s1 = s.split(" ");
                    for (int i = 0; i < s1.length; i++) {
                        System.out.println("用户 "+s1[i]);
                    }
                }
                if (message.getMesType().equals(MessageType.MESSAGE_COM)){
                    System.out.println();
                    System.out.println("收到一条来自 "+message.getSender()+" 的消息!");
                    System.out.println(message.getMesTime()+"  "+message.getSender()+" 对"+message.getGetter()+"说"+message.getContain());
                }
                if (message.getMesType().equals(MessageType.MESSAGE_GROUP_CHAT)){
                    System.out.println();
                    System.out.println("收到一条来自 "+message.getSender()+" 的消息!");
                    System.out.println(message.getMesTime()+"  "+message.getSender()+" 对所有人说"+message.getContain());
                }
                if (message.getMesType().equals(MessageType.MESSAGE_SEND_FILE)){
                    System.out.println();
                    System.out.println("收到一个来自 "+message.getSender()+" 发送的文件!");
                    FileOutputStream fos = new FileOutputStream("/Users/kai/IdeaProjects/hspedu/chapter22/src/"+message.getFileName());
                    fos.write(message.getFile());
                    fos.close();
                    System.out.println("文件保存到本地成功!");
                }if (message.getMesType().equals(MessageType.MESSAGE_BACK_NEWS)){
                    System.out.println(message.getMesTime()+"收到一条系统消息: "+message.getContain());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
