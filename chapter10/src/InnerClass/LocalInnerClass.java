package InnerClass;

/**
 * @author 王凯
 * @version 1.0
 * 局部内部类
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();outer02.m1();
        System.out.println("Outer02 ="+outer02);
    }
}
class Outer02{
    private int n1 = 10;
    private int n2 = 30;
    private void m2(){
        System.out.println("Outer02 m2()");
    }
    public void m1(){
        final class Inner02{
            private int n2 = 20;
            public void f1(){
                m2();
                System.out.println("n1="+n1);
                System.out.println("外部类的n2="+ Outer02.this.n2);
                System.out.println("Outer.this="+Outer02.this);
            }
        }
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}
