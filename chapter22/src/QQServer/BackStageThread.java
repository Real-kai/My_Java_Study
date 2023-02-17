package QQServer;

import QQCommon.Message;
import QQCommon.MessageType;
import QQCommon.Utility;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Set;

/**
 * @author 王凯
 * @version 1.0
 */
public class BackStageThread extends Thread{
    @Override
    public void run() {
        while(true){
        Message message = new Message();
        System.out.println("请输入您想说的话：");
        String news = Utility.readString(100);
        if ("exit".equals(news)){break;}
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String time = dateTimeFormatter.format(LocalDateTime.now());

        message.setMesType(MessageType.MESSAGE_BACK_NEWS);
        message.setMesTime(time);
        message.setContain(news);

        HashMap<String, ServerConnectClientThread> hm = ManageServerConnectClientThread.getHm();
        Set<String> keySet = hm.keySet();
        for (String id :keySet
        ) {
            ObjectOutputStream oos = null;
            try {
                oos = new ObjectOutputStream(hm.get(id).getSocket().getOutputStream());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                oos.writeObject(message);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }}

    }
}
