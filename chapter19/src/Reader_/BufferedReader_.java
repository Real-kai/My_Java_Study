package Reader_;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author 王凯
 * @version 1.0
 */
public class BufferedReader_ {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/a.txt"));
        String line;
        while((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
