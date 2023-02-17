package Homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework02Receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        socket.receive(packet);
        String s = new String(packet.getData(), 0, packet.getLength());
        System.out.println(s);

        String answer = "";
        if (s.equals("四大名著是哪些")){
            answer = "四大名著是《水浒传》，《红楼梦》，《西游记》，《三国演义》";
        }else {answer = "what?";
          }
        byte[] bytes1 = answer.getBytes();
        packet = new DatagramPacket(bytes1,bytes1.length, InetAddress.getLocalHost(),8888);
        socket.send(packet);

        socket.close();
    }
}
