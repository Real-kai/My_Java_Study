package Homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework01Client implements Runnable{
    private Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
    OutputStream outputStream = socket.getOutputStream();
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
    Scanner sc = new Scanner(System.in);
    InputStream inputStream = socket.getInputStream();
    InputStreamReader isr = new InputStreamReader(inputStream);
    BufferedReader br = new BufferedReader(isr);
    private boolean loop = true;

    public Homework01Client() throws IOException {
    }

    public static void main(String[] args) throws IOException {
       new Thread(new Homework01Client()).start();
    }

    public void hi() throws IOException {


        System.out.println("请输入您的问题：");
        String question = sc.next();
        bw.write(question);
        bw.newLine();
        bw.flush();



        String s = br.readLine();
        System.out.println(s);


       if ("退出聊天".equals(question)){loop = false;   br.close();
           bw.close();socket.close();}
    }
    @Override
    public void run() {
        while(loop){
            try {
                hi();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
