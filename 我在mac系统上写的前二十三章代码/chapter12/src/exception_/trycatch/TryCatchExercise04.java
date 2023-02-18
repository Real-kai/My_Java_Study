package exception_.trycatch;

import java.util.Scanner;

/**
 * @author 王凯
 * @version 1.0
 */
public class TryCatchExercise04 {
    public static void main(String[] args) {
//        while (true){
//        try {
//            Scanner sc  = new Scanner(System.in);
//            int i = sc.nextInt();
//            System.out.println(i);
//            break;
//        } catch (Exception e) {
//            System.out.println("输入错误，请重新输入一个整数!");
//        }}
        Scanner sc = new Scanner(System.in);
        int num ;
        while(true){
        System.out.println("请输入一个整数：");
            try {
                num = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("您输入的不是一个整数");
            }
       }
        System.out.println("您输入的数字是："+num);


    }
}
