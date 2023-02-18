package final_;


import Interface.IB;

import java.nio.channels.IllegalBlockingModeException;

/**
 * @author 王凯
 * @version 1.0
 */
public class FinalDetail01 {
    public static void main(String[] args) {
        System.out.println(IB.n1);
        new AA().say();
    }
}

class Person{
    private final int num=10;
    private final int num2;
    private final int num3;

    public Person() {
       num2 = 10;
    }
    {
        num3 = 10;
    }
}
class AA{
    private static final int num =10;

    public final void say(){
        System.out.println("Hi!");
    }
    private static final int num2 ;
   // private static final int num3 ;
    static{num2= 11;}

    public AA() {
      //  num3 = 12; 错误，无法在构造器重为static属性赋值。
    }

}
class BB extends AA{

}
