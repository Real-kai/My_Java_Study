package InnerClass;

/**
 * @author 王凯
 * @version 1.0
 */
public class MemberInnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.getInner01();
        //外部其他类使用成员内部类的方式一
        Outer01.Inner01 inner01 = outer01.new Inner01();
        inner01.say();
        //在外部类中写一个方法返回成员内部类的对象
        Outer01.Inner01 inner011 = outer01.getInner01();
        inner011.say();
        //第三种方式
        Outer01.Inner01 inner012 = new Outer01().new Inner01();
        inner012.say();
    }
}
class Outer01{
    private int n1 = 10;
    private String  name = "张三";
    public void hi(){
        System.out.println("hi");
    }
    class Inner01{
        private int n1 = 88;
        private double sal = 99.8;
        public void say(){
            System.out.println("n1 ="+n1+", Outer01的name= "+name+"Outer01的n1="+Outer01.this.n1);
            hi();
        }

    }
    public Inner01 getInner01(){
        return new Inner01();
    }
    public void t1(){
       Inner01 inner01 =  new Inner01();
       inner01.say();
        System.out.println(inner01.sal);
    }
}
