package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author 王凯
 * @version 1.0
 */
public class UDPReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);
        byte[] bytes = new byte[64*1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        socket.receive(dp);
        System.out.println("接收端接收数据成功");
        int length = dp.getLength();
        byte[] data = dp.getData();
        System.out.println(new String(data,0,length));

        byte[] bytes1 = "好啊，明天见".getBytes();
        DatagramPacket dp2 = new DatagramPacket(bytes1, bytes1.length, InetAddress.getLocalHost(), 8888);
        socket.send(dp2);
        System.out.println("接收端发送数据成功");

        socket.close();
    }
}
