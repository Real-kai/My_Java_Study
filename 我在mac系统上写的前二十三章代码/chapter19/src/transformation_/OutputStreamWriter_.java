package transformation_;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author 王凯
 * @version 1.0
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws Exception {
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/Users/e.txt"), "GBK"));
        br.write("hello,王凯大帅哥！");
        br.close();
    }
    @Test
    public void test() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/e.txt"),"GBK"));
        System.out.println(br.readLine());
        br.close();


    }
}
