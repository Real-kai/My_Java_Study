package codeblock;

/**
 * @author 王凯
 * @version 1.0
 */
public class CodeblockDetail02 {
    public static void main(String[] args) {
        new N();//(1) N的静态代码块被调用 (2)getN1()被调用 (3)getN2()被调用 (4)N的普通代码块被调用 (5) N的构造方法被调用
    }
}

class D{
    private int n2 = getN2();

    public D(){
        System.out.println("D的构造方法被调用");
    }

    public int getN2(){
        System.out.println("getN2被调用...");
        return 200;
    }
    {
        System.out.println("D的普通代码块被调用...");
    }
    static{
        System.out.println("D的静态代码块被执行");
    }

    private static int n1 =getN1();



    public static int getN1(){
        System.out.println("getN1()被执行");
        return 100;
    }
}


class N extends D{
    private int n2 = getN2();

    public N(){
        System.out.println("N的构造方法被调用");
    }

    public int getN2(){
        System.out.println("getN2被调用...");
        return 200;
    }
    {
        System.out.println("N的普通代码块被调用...");
    }
    static{
        System.out.println("N的静态代码块被执行");
    }

    private static int n1 =getN1();



    public static int getN1(){
        System.out.println("getN1()被执行");
        return 100;
    }
}
