package QQClient;

import QQCommon.User;
import QQCommon.Utility;
import jdk.jshell.execution.Util;
import jdk.swing.interop.SwingInterOpUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author 王凯
 * @version 1.0
 */
public class QQView{

    private boolean loop = true;
    private static UserClientService ucs = new UserClientService();
    private static ChatClientService ccs = new ChatClientService();
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       new QQView().mainMenu();
    }
       public void mainMenu() throws IOException, ClassNotFoundException {

        while(loop){
        System.out.println("=================欢迎登录网络通信系统=================");
        System.out.println("\t\t\t\t\t1 登录系统");
        System.out.println("\t\t\t\t\t9 退出系统");
        System.out.print("请输入你的选择:");
        String i = Utility.readString(1);
        switch (i){
            case "1":
                System.out.print("请输入您的用户名:");
                String id = Utility.readString(10);
                System.out.print("请输入您的密码:");
                String password = Utility.readString(11);
                if (ucs.checkLogin(id,password)){
                    System.out.println("登陆成功");
                    System.out.println("=================欢迎用户("+id+")=================");
                  while(loop){   System.out.println("=================网络通信系统二级菜单用户("+id+")=================");
                      System.out.println("\t\t\t\t\t1 显示在线用户列表");
                      System.out.println("\t\t\t\t\t2 私发消息");
                      System.out.println("\t\t\t\t\t3 群发消息");
                      System.out.println("\t\t\t\t\t4 发送文件");
                      System.out.println("\t\t\t\t\t9 退出系统");
                      System.out.print("请输入你的选择:");
                     String  s = Utility.readString(1);
                      switch(s){
                          case "1":
                              ucs.getOnlineFriend();
                              break;
                          case "2":
                              System.out.println("请输入你要发送的对象:");
                              String getter = Utility.readString(10);
                              System.out.println("请输入您要发送的内容:");
                              String content = Utility.readString(150);
                              ccs.sendMessageToOne(id,getter,content);
                              break;
                          case "3":
                              System.out.println("请输入您要发送的内容:");
                              String content2 = Utility.readString(150);
                              ccs.sendMessageToAll(id,content2);
                              break;
                          case "4":
                              System.out.println("请输入您要发送文件的对象:");
                              String userId = Utility.readString(10);
                              System.out.println("请选择您要发送的文件:");
                              String filePath = Utility.readString(100);
                              ucs.sendFile(id,userId,filePath);
                              break;
                          case "9":loop = false;
                              System.out.println("正在退出系统......");
                              ucs.Exit();
                              break;
                      }}}
                else {
                    System.out.println("登录失败");
                }
                break;
            case "9":
                loop = false;
                System.out.println("正在退出系统......");
               break;
        }}

    }

}
