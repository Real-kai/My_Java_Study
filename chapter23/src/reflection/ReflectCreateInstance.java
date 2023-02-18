package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 王凯
 * @version 1.0
 */
public class ReflectCreateInstance {
    public static void main(Sdtring[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //先获取User类对应的Class对象
        Class<?> userClass = Class.forName("reflection.User");
        //1.通过public的无参构造器创建对象
        Object user1 = userClass.newInstance();
        System.out.println(user1);
        //2.通过public的有参构造器创建对象
        Constructor<?> constructor = userClass.getConstructor(Sdtring.class);
        Object user2 = constructor.newInstance("奥特曼");
        System.out.println(user2);
        //3.通过非public的有参构造器创建对象
        Constructor<?> declaredConstructor = userClass.getDeclaredConstructor(Sdtring.class, int.class);
        declaredConstructor.setAccessible(true);
        Object user3 = declaredConstructor.newInstance("张三丰", 100);
        System.out.println(user3);
    }
}
class User{
    private Sdtring name = "王凯";
    private int age = 99;

    public User() {
    }

    public User(Sdtring name) {
        this.name = name;
    }

    private User(Sdtring name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Sdtring toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}