package api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 王凯
 * @version 1.0
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host1 = InetAddress.getLocalHost();
        System.out.println(host1);

        InetAddress host2 = InetAddress.getByName("WangKaideMacBook-Pro.local");
        System.out.println(host2);

        InetAddress host3 = InetAddress.getByName("www.baidu.com");
        System.out.println(host3);

        System.out.println(host2.getHostName());
        System.out.println(host2.getHostAddress());

        System.out.println(host3.getHostName());
        System.out.println(host3.getHostAddress());
    }
}
