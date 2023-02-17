package outputstream_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author 王凯
 * @version 1.0
 */
public class FileOutputStream_ {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/a.txt");
        if (!file.exists()){ if (file.createNewFile()){
            System.out.println("创建成功");}else{
                System.out.println("创建失败");
            }
        };
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] arr = {72,101,108,108,111,44,87,111,114,108,100};
           fileOutputStream.write(arr);

    }

    @Test
    public void writeFile01() throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("/Users/a.txt",true);
         //  fileOutputStream.write('H');
          //  fileOutputStream.write("Hello,World!".getBytes());
           fileOutputStream.write("WK,World!".getBytes(),0,2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileOutputStream.close();
        }
    }
}

