package inputstream_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 王凯
 * @version 1.0
 */
public class FileInputStream_ {
    public static void main(String[] args) throws IOException {
        System.out.print(10);
        System.out.println(11);
    }

    @Test
    public void reader01() throws IOException {
        int readDate;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("/Users/hello.txt");
            byte [] arr = new byte[10];
            while( (readDate = fileInputStream.read())!=-1){
                System.out.print(readDate+"\t");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            fileInputStream.close();
        }

    }

    @Test
    public void reader02() throws IOException {
        int readDate;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("/Users/hello.txt");
            byte [] arr = new byte[8];
            while( (readDate = fileInputStream.read(arr))!=-1){
                System.out.println(readDate+new String(arr,0,readDate));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            fileInputStream.close();
        }
    }
}
