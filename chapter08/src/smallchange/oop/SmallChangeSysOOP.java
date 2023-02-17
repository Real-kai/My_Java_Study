package smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 王凯
 * @version 1.0
 * 使用OOP(面对对象编程)将零钱通的各个功能封装成方法
 */
public class SmallChangeSysOOP {
    Scanner sc = new Scanner(System.in);
    Boolean loop = true;
    Double money = 0.0;
    double balance = 0.0;
    double pay = 0.0;
    String payName;
    SimpleDateFormat smf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String detail = "--------------零钱通明细--------------";

    public void smallChangeSysMenu(){
       do {
           System.out.println("\n=================零钱通菜单(OOP)=================");

        System.out.println("\t\t\t1 零钱通明细");
        System.out.println("\t\t\t2 收益入账");
        System.out.println("\t\t\t3 费用");
        System.out.println("\t\t\t4 退    出");
        System.out.println("请选择(1-4):");
        String key = sc.next();
        switch (key){
            case "1":
                detail();
                break;
            case "2":
                profit();
                break;
            case "3":
                cost();
                break;
            case "4":
                exit();
                break;
            default:System.out.println("输入错误，请重新输入!");
        }}
       while(loop);
    }

    public void detail(){
        System.out.println(detail);
    }

    public void profit(){
        System.out.println("请输入您的入账金额：");
        money = sc.nextDouble();
        if (money<=0){
            System.out.println("请输入大于0的金额");
            return;//退出方法 不再执行后面的代码
        }
        balance+=money;
        detail+="\n收益入账\t+"+money+"\t"+smf.format(new Date())+"\t"+"余额："+balance;
    }

    public void cost(){
        System.out.println("请输入您的支付金额：");
        pay=sc.nextDouble();
        //找出金额的不正确情况 然后过关斩将
        if (pay>balance||pay<=0){
            System.out.println("余额不足");
            return;//退出方法 不再执行后面的方法
        }
        System.out.println("请输入您的消费说明");
        payName=sc.next();
        balance-=pay;
        detail+="\n"+payName+"\t-"+pay+"\t"+smf.format(new Date())+"\t"+"余额："+balance;
    }

    public void exit(){
        String s;
        while(true) {
            System.out.println("您确认要退出吗?    y/n");
            s = sc.next();
            if (s.equals("y")||s.equals("n")){break;}
        }
        if (s.equals("y")){loop = false;
            System.out.println("-----退出了零钱通菜单-----");}
    }

}
