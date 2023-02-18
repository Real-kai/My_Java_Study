package socket;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 王凯
 * @version 1.0
 */
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("连接成功...");
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write("hello,server".getBytes());
        bos.close();
        socket.close();

    }
}
