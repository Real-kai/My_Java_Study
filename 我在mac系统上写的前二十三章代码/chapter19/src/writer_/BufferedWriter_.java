package writer_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author 王凯
 * @version 1.0
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws Exception{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/b.txt"));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/a.txt"));
        String line;
        bufferedWriter.write("hello,王凯教育");
        while((line = bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
