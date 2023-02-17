package debug;

/**
 * @author 王凯
 * @version 1.0
 */
public class Debug02 {
    public static void main(String[] args) {
        //看一下数组越界的异常
        int [] arr = {1,10,-1};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println("arr["+i+"] = "+arr[i]);
        }
        System.out.println("退出for...");
    }
}
