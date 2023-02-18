package QQServer;

import QQCommon.Message;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Set;

/**
 * @author 王凯
 * @version 1.0
 * 管理服务端连接客户端的线程
 */
public class ManageServerConnectClientThread {
    private static HashMap<String,ServerConnectClientThread> hm = new HashMap<>();//创建一个管理线程集合

    public static void groupChat(Message message) throws IOException {
        Set<String> keySet = hm.keySet();
        for (String id:keySet) {
           if (!message.getSender().equals(id)){
               ServerConnectClientThread scct = hm.get(id);
               ObjectOutputStream oos = new ObjectOutputStream(scct.getSocket().getOutputStream());
               oos.writeObject(message);
           }
        }
    }
    public static boolean isContain(String id){
       ServerConnectClientThread scct  = hm.get(id);
       if (scct == null){return false;}
       return true;
    }
    //添加服务端连接客户端线程集合
    public static void addServerConnectClientThread(String id,ServerConnectClientThread scct){
        hm.put(id,scct);
    }

    //根据用户id得到对应的线程
    public static ServerConnectClientThread getServerConnectClientThread(String id){
        return hm.get(id);
    }
    public static void  remove(String id){
        hm.remove(id);
    }
    public static HashMap<String, ServerConnectClientThread> getHm() {
        return hm;
    }

    public static void setHm(HashMap<String, ServerConnectClientThread> hm) {
        ManageServerConnectClientThread.hm = hm;
    }

    public static String getOnlineUser(){
        String s  = "";
        Set<String> keySet = hm.keySet();
        for (String k:keySet
             ) {
           s+=k+" ";
        }
        return s;
    }
}
