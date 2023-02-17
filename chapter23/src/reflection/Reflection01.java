package reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 王凯
 * @version 1.0
 */
public class Reflection01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/kai/IdeaProjects/hspedu/chapter23/src/re.properties"));
        String classfullpath = properties.getProperty("classfullpath");
        String methodName = properties.getProperty("method");

        Class<?> cls = Class.forName(classfullpath);
        Object o = cls.newInstance();
        System.out.println(o.getClass());

        Method method = cls.getMethod(methodName);
        method.invoke(o);

       // cls.getField("name");//class对象不能得到私有成员变量
        Field age = cls.getField("age");
        System.out.println(age.get(o));

        Constructor<?> constructor = cls.getConstructor();//无参构造器
        System.out.println(constructor);

        Constructor<?> constructor1 = cls.getConstructor(String.class);//()中是String类的Class对象
        System.out.println(constructor1);
    }
}
