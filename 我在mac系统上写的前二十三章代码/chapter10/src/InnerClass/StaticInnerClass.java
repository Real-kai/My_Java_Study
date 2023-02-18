package InnerClass;

/**
 * @author 王凯
 * @version 1.0
 */
public class StaticInnerClass {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.t1();
        //外部其他类访问
        //方式一
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        //方式二 外部类中编写一个返回静态内部类对象的方法
        Outer10.Inner10 inner101 = outer10.getInner10();
        inner101.say();


    }
}

class Outer10{
    private int n1 = 10;
    public static String name = "张三";
    public static void say(){}
   public  static class Inner10{
        public static String name ="jack";
        public void say(){}
        public void f1(){
            //System.out.println(n1);
            System.out.println(name+"Outer10的name="+Outer10.name);
        }
    }
    public Inner10 getInner10(){
        return new Inner10();
    }
    public void t1(){
        Inner10 inner10 = new Inner10();
        inner10.f1();
    }

}
