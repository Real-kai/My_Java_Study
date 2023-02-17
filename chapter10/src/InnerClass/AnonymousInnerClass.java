package InnerClass;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

/**
 * @author 王凯
 * @version 1.0
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04{
    private int n1 =10;

    public Outer04() {
    }

    public void method(){
       // new Dog().cry();
        /*
        class Outer04$1 implements IA{
         @Override
            public void cry() {
                System.out.println("小狗汪汪叫...");
            }
        }// Outer04是JAVA在底层创建的一个类名，只使用一次就丢弃了（因为只能创建一个对象）
         */
        IA DOG = new IA(){
            @Override
            public void cry() {
                System.out.println("小狗汪汪叫...");
            }
        };DOG.cry();
        System.out.println(DOG.getClass());//Outer04$1
        /*
        class Outer04$2 extends Father{
         public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
            public void hi(){}
        }
         */
      Father father =   new  Father("王凯"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
            public void hi(){}
        };
      father.test();
      new BB(){
          @Override
          void say() {

          }
      };

    }
}
abstract  class BB{
    abstract void say();
}
interface IA{
    void cry();
}
//class Dog implements IA{
//    @Override
//    public void cry() {
//        System.out.println("小狗汪汪叫...");
//    }
//}
class Father{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Father(String name) {
        this.name = name;
    }
    public void test(){
    }
}
