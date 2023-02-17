package file_;


import org.junit.Test;

import java.io.File;

/**
 * @author 王凯
 * @version 1.0
 */
public class FileInfo {
    public static void main(String[] args) {

    }
    @Test
    public void fileInfomation(){
        File file = new File("/Users/kai");
        System.out.println(file.length());
    }
}

