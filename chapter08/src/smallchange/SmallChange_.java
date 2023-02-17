package smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 王凯
 * @version 1.0
 */
public class SmallChange_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean loop = true;
        Double money = 0.0;
        double balance = 0.0;
        double pay = 0.0;
        String payName;
        SimpleDateFormat smf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String detail = "--------------零钱通明细--------------";
        do {
            System.out.println("\n=================零钱通菜单=================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 费用");
            System.out.println("\t\t\t4 退    出");
            System.out.println("请选择(1-4):");
            String key = sc.next();
            switch (key){
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.println("请输入您的入账金额：");
                    money = sc.nextDouble();
                    if (money<=0){
                        System.out.println("请输入大于0的金额");
                        break;
                    }
                    balance+=money;
                    detail+="\n收益入账\t+"+money+"\t"+smf.format(new Date())+"\t"+"余额："+balance;
                    break;
                case "3":
                    System.out.println("请输入您的支付金额：");
                    pay=sc.nextDouble();
                    //找出金额的不正确情况 然后过关斩将
                    if (pay>balance||pay<=0){
                        System.out.println("余额不足");
                        break;
                    }
                    System.out.println("请输入您的消费说明");
                    payName=sc.next();
                    balance-=pay;
                    detail+="\n"+payName+"\t-"+pay+"\t"+smf.format(new Date())+"\t"+"余额："+balance;

                    break;
                case "4":
                    String s;
                    while(true) {
                        System.out.println("您确认要退出吗?    y/n");
                        s = sc.next();
                        if (s.equals("y")||s.equals("n")){break;}
                    }
                    if (s.equals("y")){loop = false;
                        System.out.println("-----退出了零钱通菜单-----");}
                    //建议一段代码完成一个功能(越小越好)，不要混在一起，低耦合，高聚合
//                    if (s.equals("y"))
//                    {
//                        System.out.println("程序正在退出中......");loop = false;
//                    break;}else if (s.equals("n")){break;}
//                    }
                    break;
                default :
                    System.out.println("输入错误，请重新输入!");
            }
        }while(loop);
    }
}
