package outputstream_;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author 王凯
 * @version 1.0
 */
public class Copy {
    public static void main(String[] args) throws Exception{
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("/Users/000.jpeg"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("/Users/kai/a.jpeg"));
        byte[] bytes = new byte[1024];
        int readLen = 0;

        while((readLen = bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes,0,readLen);
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
