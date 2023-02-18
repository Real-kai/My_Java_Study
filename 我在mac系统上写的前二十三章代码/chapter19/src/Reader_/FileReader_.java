package Reader_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 王凯
 * @version 1.0
 */
public class FileReader_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String filePath = "/Users/story.txt";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
            char [] chars = new char[8];
            int readLen = 0;
            while((readLen=fileReader.read(chars))!=-1){
                System.out.println(new String(chars,0,readLen));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

