package socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author 王凯
 * @version 1.0
 */
public class TCPFileCopyClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/120.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] bytes = new byte[1024];
        int readLen = 0;
        while ((readLen = bis.read(bytes))!=-1){
            bos.write(bytes,0,readLen);
            bos.flush();
        }
        socket.shutdownOutput();
        bis.close();
        System.out.println("发送图片完成");


        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(br.readLine());

        br.close();
        bos.close();
        socket.close();
    }
}
