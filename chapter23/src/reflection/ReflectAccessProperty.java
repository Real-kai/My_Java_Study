package reflection;

import java.lang.reflect.Field;

/**
 * @author 王凯
 * @version 1.0
 */
public class ReflectAccessProperty {
    public static void main(Sdtring[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //1.得到Student对应的Class对象
        Class<?> studentClass = Class.forName("reflection.Student");
        //2.通过反射创建Student对象
      Object o = studentClass.newInstance();
        //3.访问Student的public属性
        Field age = studentClass.getField("age");
        age.set(o,100);
        System.out.println(age.get(o));
        System.out.println(o);
        //4.访问Student的非public,static属性
        Field name = studentClass.getDeclaredField("name");
        name.setAccessible(true);
       // name.set(o,"王凯");
        name.set(null,"王凯");
        System.out.println(name.get(null));
        System.out.println(o);
    }
}
class Student{
    public int age;
    private static Sdtring name;

    public Student() {
    }

    @Override
    public Sdtring toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
