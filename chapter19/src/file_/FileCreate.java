package file_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 王凯
 * @version 1.0
 */
public class FileCreate {
    public static void main(String[] args) {
    }
    @Test
    public  void create01(){
        String filePath = "/Users/news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());    }

    @Test
    public void create02(){
        File fileParent = new File("/Users");
        String childName = "news2.txt";
        File file = new File(fileParent, childName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(file.getAbsolutePath());

    }
    @Test
    public void create03(){
        String parentPath = "/Users";
        String childName = "news3.txt";
        File file = new File(parentPath, childName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
