package exception_;

/**
 * @author 王凯
 * @version 1.0
 */
public class NumberFormatException {
    public static void main(String[] args) {
        String name = "王凯";
        int i = Integer.parseInt(name);
        System.out.println(i);
    }
}
