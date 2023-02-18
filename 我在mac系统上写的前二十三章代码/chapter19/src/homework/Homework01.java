package homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {
        File file01 = new File("/Users/MyTemp");
        if (!file01.exists()){
            file01.mkdir();
        }
        File file = new File("/Users/MyTemp/hello.txt");
        if (file.exists()){
            System.out.println("该文件已存在");
        }else{file.createNewFile(); FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("hello,world!");
            fileWriter.close();}

    }
}
