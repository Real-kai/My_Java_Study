package class_;

import java.io.Serializable;

/**
 * @author 王凯
 * @version 1.0
 */
public class Class03 {
    public static void main(String[] args) {
        Class<String> cls1 = String.class;
        Class<Serializable> cls2 = Serializable.class;
        Class<int[]> cls3 = int[].class;
        Class<Thread.State> cls4 = Thread.State.class;
        Class<Deprecated> cls5 = Deprecated.class;
        Class<Integer> cls6 = int.class;
        Class<Void> cls7 = Void.class;
        Class<Class>  cls8 = Class.class;

        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(cls3);
        System.out.println(cls4);
        System.out.println(cls5);
        System.out.println(cls6);
        System.out.println(cls7);
        System.out.println(cls8);}
}
