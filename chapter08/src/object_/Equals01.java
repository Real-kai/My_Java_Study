package object_;

/**
 * @author 王凯
 * @version 1.0
 */
public class Equals01 {
    public static void main(String[] args) {
        B a = new B();
        B b =a;
        B c = b;
        System.out.println(a == c);//true
        System.out.println(b == c);//true
        A d = a;
        System.out.println(d == a);//true

        int num1 = 10;
        double num2 =10.0;
        System.out.println(num1 == num2);//true

        boolean abd = "abc".equals("abd");
        System.out.println(abd);//false

    }
}
class A{}
class B extends A{}
