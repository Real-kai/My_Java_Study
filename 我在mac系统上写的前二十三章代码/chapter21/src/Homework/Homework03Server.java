package Homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework03Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = inputStream.readAllBytes();
        String s = new String(bytes, 0, bytes.length);

        String songPath = "";
        if (s.equals("高山流水")){
            songPath ="/Users/kai/IdeaProjects/hspedu/chapter21/src/高山流水.mp3";
        }else {songPath = "/Users/kai/IdeaProjects/hspedu/chapter21/src/无名.mp3";}
        FileInputStream fileInputStream = new FileInputStream(songPath);
        byte[] bytes1 = fileInputStream.readAllBytes();
        fileInputStream.close();

        OutputStream outputStream = accept.getOutputStream();
        System.out.println("正在为您下载...");
        outputStream.write(bytes1);
        accept.shutdownOutput();

        outputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();

    }
}
