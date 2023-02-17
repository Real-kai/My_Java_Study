package reflection.question;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 王凯
 * @version 1.0
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
       // new Cat().method();

        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/kai/IdeaProjects/hspedu/chapter23/src/re.properties"));
        String classfullpath = properties.getProperty("classfullpath");
        String methodName = properties.getProperty("method");
       // System.out.println(classfullpath+" "+method);

        //1.加载类，返回Class类型的对象 aClass
        Class<?> cls = Class.forName(classfullpath);
        //2.通过aClass得到你加载的类的对象实例
        Object o = cls.getDeclaredConstructor().newInstance();
        System.out.println(o.getClass());

        Method method = cls.getMethod(methodName);
        method.invoke(o);

    }
}
