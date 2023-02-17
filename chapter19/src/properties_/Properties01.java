package properties_;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author 王凯
 * @version 1.0
 */
public class Properties01 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("/Users/kai/IdeaProjects/hspedu/chapter19/src/mysql.propertise"));
        String line;
        while((line=br.readLine())!=null){
            String[] split = line.split("=");
            if (split[0].equals("IP")){System.out.println(split[0]+" 值是:"+split[1]);}
        }
        br.close();
    }}
