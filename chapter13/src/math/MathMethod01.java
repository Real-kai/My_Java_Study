package math;

import java.util.Random;

/**
 * @author 王凯
 * @version 1.0
 */
public class MathMethod01 {
    public static void main(String[] args) {
        Random rd = new Random();

       // for (int j = 0; j < 10; j++) {
       //     System.out.println(rd.nextInt(6) + 2);
       // }
        for (int i = 0; i < 100; i++) {
            System.out.println(cal(4,18));
        }
    }
    public static int cal(int a,int b){
        return (int)( Math.random()*(b-a+1)+a);
    }

}
