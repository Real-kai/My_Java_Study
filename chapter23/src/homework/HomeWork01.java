package homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 王凯
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException, InstantiationException, ClassNotFoundException {
        Class<?> aClass = Class.forName("homework.PrivateTest");
        Object o = aClass.newInstance();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"王凯");

        Method getName = aClass.getMethod("getName");
        Object invoke = getName.invoke(o);
        System.out.println(invoke);
        System.out.println("helloworld");
    }
}
class PrivateTest{
    private String name = "helloKitty";

    public PrivateTest() {
    }

    public String  getName() {
       return name;
    }
}