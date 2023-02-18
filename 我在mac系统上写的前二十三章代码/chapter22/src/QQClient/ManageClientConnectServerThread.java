package QQClient;

import java.util.HashMap;

/**
 * @author 王凯
 * @version 1.0
 */
public class ManageClientConnectServerThread {
    private static HashMap<String,ClientConnectServerThread> hm = new HashMap<>();

    public static void addClientConnectServerThread(String id,ClientConnectServerThread clientConnectServerThread){
        hm.put(id,clientConnectServerThread);
    }

    public static ClientConnectServerThread getClientConnectServerThread(String id){
        return hm.get(id);
    }

    public static HashMap<String, ClientConnectServerThread> getHm() {
        return hm;
    }

    public static void setHm(HashMap<String, ClientConnectServerThread> hm) {
        ManageClientConnectServerThread.hm = hm;
    }
}
