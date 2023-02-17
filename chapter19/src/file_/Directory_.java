package file_;

import org.junit.jupiter.api.Test;

import java.awt.desktop.UserSessionEvent;
import java.io.File;
import java.io.IOException;

/**
 * @author 王凯
 * @version 1.0
 */
public class Directory_ {
    @Test
    public void Directory(){
        File file = new File("/Users/news1.txt");
        if (file.exists()){
           if (file.delete()){
               System.out.println("删除成功");
           }else{
               System.out.println("删除失败");
           };
       }else {
            System.out.println("该文件不存在。。。");
        }
    }
    @Test
    public void m2(){
        File file = new File("/Users/demo02");

        if (file.exists()){
            if(file.delete()){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
        }
        else {
            System.out.println("该目录不存在");
        }
   }
@Test
   public void m3(){
       File file = new File("/Users/demo");
    if (file.exists()){
        System.out.println(file.getAbsolutePath()+"已经存在");
    }
    else {

            if (file.mkdir()){
                System.out.println(file.getAbsolutePath()+"创建成功");
            }else{
                System.out.println(file.getAbsolutePath()+"创建失败");
            }
    }

   }
   public void isExists (File file){

   }
}
