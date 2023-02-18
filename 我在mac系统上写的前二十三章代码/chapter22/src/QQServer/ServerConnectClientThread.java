package QQServer;

import QQCommon.Message;
import QQCommon.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 王凯
 * @version 1.0
 * 服务端连接客户端线程
 */
public class ServerConnectClientThread extends Thread{
    private Socket socket;//定义一个socket
    private String userId;
    private static HashMap<String, ArrayList<Message>> offLineMessage  = new HashMap<>();

    public Socket getSocket() {
        return socket;
    }

    public ServerConnectClientThread(String userId, Socket socket) {
        this.socket = socket;
        this.userId = userId;
    }


    @Override
    public void run() {
        if (offLineMessage.containsKey(userId)){
            ArrayList<Message> messList = offLineMessage.get(userId);

            for (Message mess:messList
            ) {
                try {
                    ObjectOutputStream oos = null;
                    try {
                        oos = new ObjectOutputStream(socket.getOutputStream());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    oos.writeObject(mess);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            offLineMessage.remove(userId);
        }
        //在后台不停地运行，用来接收来自客户端的消息
        while(true){
            try {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message =(Message) ois.readObject();

                if (message.getMesType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)){
                    System.out.println(message.getSender()+" 要在线用户列表");
                    //新建一个消息
                    Message message1 = new Message();
                    //设置消息类型
                    message1.setMesType(MessageType.MESSAGE_RET_ONLINE_FRIEND);
                    //设置接收者
                    message1.setGetter(message.getSender());
                    //添加在线用户列表
                    message1.setContain(ManageServerConnectClientThread.getOnlineUser());

                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message1);
                }
                if (message.getMesType().equals(MessageType.MESSAGE_CLIENT_EXIT)){
                    socket.close();
                    ManageServerConnectClientThread.remove(userId);
                    System.out.println(userId+" 服务端线程已退出");
                  break;
                }
                if (message.getMesType().equals(MessageType.MESSAGE_COM)){
                    ServerConnectClientThread scct = ManageServerConnectClientThread.getServerConnectClientThread(message.getGetter());
                    System.out.println(scct);
                    if (scct==null){
                      if (!offLineMessage.containsKey(message.getGetter())){
                          ArrayList<Message> messagesList = new ArrayList<>();
                          messagesList.add(message);
                          offLineMessage.put(message.getGetter(),messagesList);
                      }else {
                          offLineMessage.get(message.getGetter()).add(message);
                      }
                    }else {
                        ObjectOutputStream oos = new ObjectOutputStream(scct.getSocket().getOutputStream());
                        oos.writeObject(message);
                    }
                }
                if (message.getMesType().equals(MessageType.MESSAGE_GROUP_CHAT)){
                    ManageServerConnectClientThread.groupChat(message);
                }if (message.getMesType().equals(MessageType.MESSAGE_SEND_FILE)){
                    ServerConnectClientThread scct = ManageServerConnectClientThread.getServerConnectClientThread(message.getGetter());
                    if (scct==null){
                        if (!offLineMessage.containsKey(message.getGetter())){
                            ArrayList<Message> messagesList = new ArrayList<>();
                            messagesList.add(message);
                            offLineMessage.put(message.getGetter(),messagesList);
                        }else {
                            offLineMessage.get(message.getGetter()).add(message);
                        }
                    }else {
                    ObjectOutputStream oos = new ObjectOutputStream(scct.getSocket().getOutputStream());
                    oos.writeObject(message);}
                }
                else {
                    System.out.println("其他消息");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
