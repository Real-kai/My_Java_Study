package exception_;

import java.util.concurrent.Callable;

/**
 * @author 王凯
 * @version 1.0
 */
public class ClassCastException {
    public static void main(String[] args) {
        A a = new B();
        B b = (B) a;
        C c = (C) a;//ClassCastException 类型转换异常
    }
}
class A{
}
class B extends A{}
class C extends A{}
