package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author 王凯
 * @version 1.0
 */
public class TCPFileCopyServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();
        System.out.println("连接成功");

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/kai/IdeaProjects/hspedu/chapter21/src/121.jpg"));
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        byte [] bytes = new byte[1024];
        int readLen = 0;
        while((readLen=bis.read(bytes))!=-1){
            bos.write(bytes,0,readLen);
        }
        System.out.println("收到图片完成");
        bos.close();


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("收到图片");
        bw.flush();
        accept.shutdownOutput();

        bw.close();
        bis.close();
        accept.close();
        serverSocket.close();
    }
}
