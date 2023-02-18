package throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 王凯
 * @version 1.0
 */
public class Throws01 {
    public static void main(String[] args) throws Exception{
        new Throws01().f1();
    }

    public void f1()throws Exception {

            FileInputStream fis = new FileInputStream("d://aa.txt");

    }
}
