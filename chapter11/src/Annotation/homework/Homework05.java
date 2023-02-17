package Annotation.homework;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        A jack = new A("jack");
        System.out.println(jack);
        jack.f1();
        jack.show();
    }
}
class A{
    private final String name;

    public A(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name);
    }

    public void f1(){
        class B{
            private final String name;

            public B(String name) {
                this.name = name;
            }

            public void show(){
                System.out.println(A.this.name);
                System.out.println(A.this);
            }
        }
        new B("张三").show();
    }
}