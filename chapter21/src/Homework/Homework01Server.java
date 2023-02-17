package Homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework01Server implements Runnable{
    private ServerSocket serverSocket = new ServerSocket(9999);
    private Socket accept = serverSocket.accept();
    InputStream inputStream = accept.getInputStream();
    BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
    OutputStream outputStream = accept.getOutputStream();
    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
    BufferedWriter bw = new BufferedWriter(outputStreamWriter);
    private boolean loop = true;

    public Homework01Server() throws IOException {
    }

    public static void main(String[] args) throws IOException {
            new Thread(new Homework01Server()).start();
    }

    public void hi() throws IOException {
        String s = br.readLine();
        System.out.println(s);

        String answer = "";
        if (s.equals("name")){
            answer = "我叫王开";
        }else if ("hobby".equals(s)){
            answer ="编写java程序";
        }else{
            answer ="你说啥呢";
        } bw.write(answer);
        bw.newLine();
        bw.flush();


       if ("退出游戏".equals(s)){
           loop = false;
           outputStreamWriter.close();
           br.close();
           accept.close();
        serverSocket.close();}
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
