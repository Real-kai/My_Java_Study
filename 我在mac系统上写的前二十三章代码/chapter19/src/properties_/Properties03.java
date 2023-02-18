package properties_;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @author 王凯
 * @version 1.0
 */
public class Properties03 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.setProperty("user","王凯");
        properties.setProperty("pwd","123456");
        properties.setProperty("age","19");
        properties.store(new FileOutputStream("/Users/kai/IdeaProjects/hspedu/chapter19/src/mysql02.propertise"),"hello");
        properties.setProperty("pwd","19960930");
        properties.store(new FileOutputStream("/Users/kai/IdeaProjects/hspedu/chapter19/src/mysql02.propertise"),null);

    }
}
