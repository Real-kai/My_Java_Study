package debug;

/**
 * @author 王凯
 * @version 1.0
 */
public class Debug01 {
    public static void main(String[] args) {
        //debug数组
        //演示逐行执行 F8：步过
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum+=i;
            System.out.println("i= "+i);
            System.out.println("sum = "+sum);
        }
    }
}
