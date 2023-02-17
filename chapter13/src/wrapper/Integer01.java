package wrapper;

/**
 * @author 王凯
 * @version 1.0
 */
public class Integer01 {
    public static void main(String[] args) {
        //手动装箱 int--》Integer  JDK5之前
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        //手动拆箱 Integer--》int
        int i = integer.intValue();
        //JDK5之后 自动装箱 自动拆箱
        Integer n2  = n1;
        int n3 = n2;

    }
}
