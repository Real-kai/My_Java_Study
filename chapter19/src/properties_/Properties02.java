package properties_;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @author 王凯
 * @version 1.0
 */
public class Properties02 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.load(new FileReader("/Users/kai/IdeaProjects/hspedu/chapter19/src/mysql.propertise"));
        properties.list(System.out);
        System.out.println("用户名: "+properties.getProperty("user"));
        System.out.println("密码: "+properties.getProperty("pwd"));
        properties.setProperty("地址","浙江嘉兴");

    }
}
