package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 王凯
 * @version 1.0
 */
public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String line ;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("hello,client");
       // bw.newLine();//也可以使用newLine()来结束写入 不过对方一定要使用readLine()读取才可以
        bw.flush();//使用字符流写入数据 需要调用flush(),否则数据写不进去
        accept.shutdownOutput();

        bw.close();
        br.close();
        accept.close();
        serverSocket.close();
    }
}
