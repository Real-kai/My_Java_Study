package transformation_;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * @author 王凯
 * @version 1.0
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/c.txt"),"gbk"));

        System.out.println(br.readLine());
       br.close();


    }
}
