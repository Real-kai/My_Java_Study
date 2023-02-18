package exception_;

/**
 * @author 王凯
 * @version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
       // int res = num1/num2;//因为num2(分母)为0，结果无穷大，所以会出现ArithmeticException 算术异常
        //可以使用 try-catch异常处理机制来解决。

        try {
            int res = num1/num2;
        } catch (Exception e) {
            System.out.println("出现的异常原因是："+e.getMessage());
        }
        System.out.println("程序继续运行...");
    }
}
