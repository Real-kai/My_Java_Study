package UDP;

import java.io.IOException;
import java.net.*;

/**
 * @author 王凯
 * @version 1.0
 */
public class UDPSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);
        byte[] bytes =  "hello,明天去吃火锅！".getBytes();
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),9999);
        socket.send(dp);

        byte[] bytes1 = new byte[64*1024];
        DatagramPacket dp2 = new DatagramPacket(bytes1, bytes1.length);
        socket.receive(dp2);
        System.out.println("发送端接收数据成功");
        int length = dp2.getLength();
        byte[] data = dp2.getData();
        System.out.println(new String(data,0,length));

        socket.close();
    }
}
