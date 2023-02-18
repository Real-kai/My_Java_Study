package polymorphic.detail;

/**
 * @author 王凯
 * @version 1.0
 */
public class PolyDetail02 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.count);//10
    }
}
class A{
    int  count = 10;
}
class B extends A{
    int count = 20;
}
