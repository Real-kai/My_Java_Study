package transformation_;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author 王凯
 * @version 1.0
 */
public class Transformation_ {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("/Users/c.txt"));
        String s = br.readLine();
        System.out.println(s);
        br.close();
    }
}
