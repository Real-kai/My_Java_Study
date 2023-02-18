package Homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework03Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要下载的歌曲");
        String song = sc.next();
        outputStream.write(song.getBytes());
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = inputStream.readAllBytes();

        FileOutputStream fos = new FileOutputStream("/Users/"+song+".mp3");
        fos.write(bytes);
        System.out.println("下载完成");
        fos.close();

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
