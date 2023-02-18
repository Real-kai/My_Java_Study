package socket;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 王凯
 * @version 1.0
 */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //监听一个端口
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待连接中");
        Socket accept = serverSocket.accept();
        System.out.println("连接成功...");
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        byte[] bytes = new byte[1024];
        int readLen = 0;
        while((readLen = bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,readLen));
        }
        bis.close();
        accept.close();
        serverSocket.close();
    }
}
