package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.String;

/**
 * @author 王凯
 * @version 1.0
 */
public class ReflectAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, java.lang.ClassNotFoundException {
        //1.得到Boss类对应的Class对象
        Class<?> bossClass = Class.forName("reflection.Boss");
        //2.通过反射创建Boss对象
        Object o = bossClass.newInstance();
        //3.通过反射访问 public 的hi（）
        //Method hi = bossClass.getMethod("hi", String.class);
        Method hi = bossClass.getDeclaredMethod("hi", String.class);
        hi.invoke(o,"王凯");
        //4.通过反射访问private static方法
        Method say = bossClass.getDeclaredMethod("say", String.class, int.class, double.class);
        say.setAccessible(true);
        //Object zsf = say.invoke(o, "张三丰", 100, 28);
        Object zsf = say.invoke(null, "张三丰", 100, 28);//因为是静态方法，所以o可以是null
        System.out.println(zsf);
        System.out.println(zsf.getClass());
    }

    private static class ClassNotFoundException extends Exception {
    }
}
class Boss{
    public int age;
    private String name;

    public Boss() {
    }

    private static String say(String s, int i, double d){
        return s+" "+i+" "+d;
    }

    public void hi(String s){
        System.out.println(s);
    }
}
 class Dog{
     public static void main(String[] args) {

     }

}