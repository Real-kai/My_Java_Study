package socket;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 王凯
 * @version 1.0
 */
public class test {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/b.txt");
        byte [] bytes = new byte[1024];
        int readLen = 0;
        while((readLen= fileInputStream.read(bytes))!=-1){
            System.out.println(new String (bytes,0,readLen));
        }
        fileInputStream.close();
    }
}
