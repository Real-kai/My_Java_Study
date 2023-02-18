package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author 王凯
 * @version 1.0
 */
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();

        InputStream is = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int readLen = 0;
        while((readLen =is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,readLen));
        }

        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("hello,client".getBytes());
        accept.shutdownOutput();

        is.close();
        outputStream.close();
        accept.close();
        serverSocket.close();
    }
}
