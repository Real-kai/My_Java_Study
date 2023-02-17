package smallchange;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author 王凯
 * @version 1.0
 */
public class Person {
   private String name;
   private int age;
   private double balance;
   SimpleDateFormat smf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

   ArrayList<String> profitList = new ArrayList<String>();
    ArrayList<String> costList = new ArrayList<String>();
    ArrayList<String> list = new ArrayList<>();
   public String profit(double money){
       if (money<=0){
           return"请输入正确的金额!";

       }
       balance+=money;
       String str = "收益入账+"+money+"\t"+smf.format(new Date())+"\t"+"余额："+balance;
       profitList.add(str);
       list.add(str);
       return str;

   }

   public String cost(String name,double money){
       if (money>balance){ return "余额不足";}
       balance-=money;
       String str =  name+"  -"+money+"\t"+smf.format(new Date())+"\t"+"余额："+balance;
       costList.add(str);
       list.add(str);
       return str;
   }

   public void detail(){
       System.out.println("--------------零钱通明细--------------");
       for (int i = 0; i < list.size(); i++) {
           System.out.println(list.get(i));
       }
   }

   public double getBalance() {
        return balance;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
