package outputstream_;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author 王凯
 * @version 1.0
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        out.print("hello,kakarotto");
        out.write("你好，王凯".getBytes());
        out.close();

        System.setOut(new PrintStream("/Users/f.txt"));
        System.out.println("你好，我叫卡卡罗特");
    }
}
