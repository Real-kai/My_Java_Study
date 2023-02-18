package main;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * @author 王凯
 * @version 1.0
 */
public class Main01 {
    private static  String name = "hspedu";
    private int n1 = 1;
    public static void main(String[] args) {
        //静态方法main可以访问本类的静态成员
        System.out.println(name);
        //静态方法不可以访问本类的非静态成员
        //System.out.println(n1);  报错
        //静态方法main想要访问本类的非静态成员，就要先创建一个实例对象 再去调用
        Main01 main01= new Main01();
        System.out.println(main01.n1);

    }
}
