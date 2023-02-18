package outputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 王凯
 * @version 1.0
 */
public class FileCopy_ {
    public static void main(String[] args) throws IOException {
        String srcFilePath = "/Users/xhz.jpeg";
        String destFilePath = "/Users/xhz/xhz.jpeg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream=new FileOutputStream(destFilePath);
            byte[] arr = new byte[10];
            int num;
            while((num = fileInputStream.read(arr))!=-1){
                fileOutputStream.write(arr,0,num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();
            fileOutputStream.close();
        }
    }
}

