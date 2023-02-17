package InnerClass;

/**
 * @author 王凯
 * @version 1.0
 */
public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}
class Outer05{
    private int n1 = 99;
    public void f1(){

        new Person(){
            private int n1 = 100;
            public void say(){
                System.out.println(Outer05.this.n1); //Outer05.this = Outer05的对象 hashcode一样
                System.out.println("hello");
            }
        }.ok("jack");

    }
}
class Person{

    public void hi(){
        System.out.println("hi");
    }
    public void ok(String str){
        System.out.println("Person str = "+str);
    }
}
