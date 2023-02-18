package writer_;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 王凯
 * @version 1.0
 */
public class FileWriter_ {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile01() throws IOException {
        String filePath  ="/Users/note.txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
           // fileWriter.write("风雨过后，定见彩虹");
            fileWriter.write("风雨过后，定检彩虹".toCharArray(),0,9);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileWriter.close();
        }
    }
}
