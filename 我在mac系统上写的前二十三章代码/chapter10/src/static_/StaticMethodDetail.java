package static_;

/**
 * @author 王凯
 * @version 1.0
 */
public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();
        //D.say 报错
        new D().say();//只能通过对象去调用
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

class D{
    private String name;
    public void say(){
    }

    public static void hi(){
       // name;  报错 无法应用非静态的方法和变量
       // say();
        //this.say();//类方法(静态方法)不允许使用和对象相关的关键字，比如:this super
    }
}
