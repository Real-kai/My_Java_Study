package smallchange;

import java.util.Scanner;

/**
 * @author 王凯
 * @version 1.0
 */
public class SmallChangeSys {
    public static void main(String[] args) {
        Person p1 = new Person("王凯",18);
        p1.profit(1000);
        p1.cost("真功夫",3);
        p1.profit(200);
        p1.profit(300);
        p1.cost("耐克",350);
        smallChangeMenu(p1);


    }

    public static void smallChangeMenu(Person person){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------"+person.getName()+"的零钱通明细---------------");
        System.out.println("\t"+"1.零钱通明细");
        System.out.println("\t"+"2.收益入账");
        System.out.println("\t"+"3.费用");
        System.out.println("\t"+"4.退出");
        System.out.println("请选择(1-4):");
        String s = sc.next();
        if (s.equals("1")){person.detail();}
        else if (s.equals("2")){
            for (int i = 0; i < person.profitList.size(); i++) {
                System.out.println(person.profitList.get(i));
            }
        }
       else if (s.equals("3")){for (int i = 0; i < person.costList.size(); i++) {
            System.out.println(person.costList.get(i));
        }}
        else if (s.equals("4")){
            System.out.println("退出");
        }
        else{
            System.out.println("输入错误，请重新输入!");
        }
    }

}
