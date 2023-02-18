package QQClient;

import QQCommon.Message;
import QQCommon.MessageType;
import QQCommon.Utility;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 王凯
 * @version 1.0
 */
public class ChatClientService {
    public void sendMessageToOne(String sendId,String getterId,String content) throws IOException {
        Message message = new Message();
        //设置消息类型
        message.setMesType(MessageType.MESSAGE_COM);
        //设置发送者
        message.setSender(sendId);
        //设置发送时间
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        message.setMesTime(dateTimeFormatter.format(LocalDateTime.now()));
        //设置接收人
        message.setGetter(getterId);
        //设置发送的内容
        message.setContain(content);

        ObjectOutputStream oos =
                new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(sendId).getSocket().getOutputStream());
        oos.writeObject(message);
        System.out.println(message.getSender()+" 对"+message.getGetter()+"说 : "
                +message.getContain());
    }

    public void sendMessageToAll(String sendId,String content) throws IOException {
        Message message = new Message();
        //设置消息类型
        message.setMesType(MessageType.MESSAGE_GROUP_CHAT);
        //设置发送者
        message.setSender(sendId);
        //设置发送时间
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        message.setMesTime(dateTimeFormatter.format(LocalDateTime.now()));

        //设置发送的内容
        message.setContain(content);

        ObjectOutputStream oos =
                new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(sendId).getSocket().getOutputStream());
        oos.writeObject(message);
        System.out.println(message.getSender()+" 对"+" 所有人说 : "
                +message.getContain());
    }
}
