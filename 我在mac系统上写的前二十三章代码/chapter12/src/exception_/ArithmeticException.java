package exception_;

/**
 * @author 王凯
 * @version 1.0
 */
public class ArithmeticException {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int res = num1/num2;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
