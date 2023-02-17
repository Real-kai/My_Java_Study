package Homework;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework02Sender {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的问题");
        String question = scanner.next();
        byte[] bytes = question.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 9999);
        socket.send(datagramPacket);

        byte[] bytes1 = new byte[1024];
       datagramPacket = new DatagramPacket(bytes1, bytes1.length);
        socket.receive(datagramPacket);
        System.out.println(new String(datagramPacket.getData(),0,bytes1.length));

        socket.close();
    }
}
