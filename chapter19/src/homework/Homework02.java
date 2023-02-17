package homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/aa.txt"),"GBK"));
        String line;
        int i = 1;
        while((line = bf.readLine())!=null){
            System.out.println(i++ +"\t"+line);
        }

        bf.close();

    }
}
