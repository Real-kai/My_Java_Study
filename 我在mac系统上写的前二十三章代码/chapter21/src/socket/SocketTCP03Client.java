package socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 王凯
 * @version 1.0
 */
public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("hello,server");
       bw.newLine();
        bw.flush();
       // socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        //关闭顺序一般是先打开的后关闭 后打开的  先关闭
        br.close();
        bw.close();
        socket.close();
    }
}
