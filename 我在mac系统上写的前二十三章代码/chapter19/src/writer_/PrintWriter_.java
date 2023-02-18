package writer_;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @author 王凯
 * @version 1.0
 */
public class PrintWriter_ {
    public static void main(String[] args) throws Exception{
        PrintWriter printWriter = new PrintWriter(new PrintStream("/Users/a1.txt"));
        //PrintWriter printWriter = new PrintWriter(new FileWriter("/Users/a1.txt"));
        printWriter.println("你好，王凯");
        printWriter.close();
    }
}
