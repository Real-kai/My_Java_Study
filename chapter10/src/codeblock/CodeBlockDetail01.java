package codeblock;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * @author 王凯
 * @version 1.0
 */
public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //new B();
//        System.out.println("================");
//        new A();
//        System.out.println("=================");
//        System.out.println(C.n1);
        System.out.println(A.n1);

    }
}

class C{
    public static int n1 = 10;
    static {
        System.out.println("C的静态代码块被执行...");
    }
}
class B{
    static{
        System.out.println("B的静态代码块1被执行...");
    }
        }
class A extends B{
    public static int n1 = 10;
    static{
        System.out.println("A的静态代码块被执行...");
    }
}
