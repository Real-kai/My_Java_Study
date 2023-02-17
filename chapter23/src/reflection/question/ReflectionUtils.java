package reflection.question;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 王凯
 * @version 1.0
 * 演示如何通过反射获取类的结构信息
 */
public class ReflectionUtils {
    public static void main(String[] args) {
    }

    @Test
    public void api_01(){
        //        1.getName:获取全类名
        Class<Person> personClass = Person.class;
        System.out.println(personClass);
//        2.getSimpleName:获取简单类名
        System.out.println(personClass.getSimpleName());
//        3.getFields:获取所有public修饰的属性，包含本类以及父类的
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
//        4.getDeclaredFields:获取本类中所有属性
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
//        5.getMethods:获取所有public修饰的方法，包含本类以及父类的
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
//        6.getDeclaredMethods:获取本类中所有方法
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
//        7.getConstructors:获取所有public修饰的构造器，包含本类的
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
//        8.getDeclaredConstructors:获取本类中所有构造器
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
//        9.getPackage:以Package形式返回包信息
        System.out.println(personClass.getPackage());
//        10.getSuperClass:以Class形式返回父类信息
        Class<? super Person> superclass = personClass.getSuperclass();
        System.out.println(superclass);
//        11.getlnterfaces:以Class[]形式返回接口信息
        Class<?>[] interfaces = personClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
//        12.getAnnotations:以Annotation[]形式返回注解信息
        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        System.out.println(new Person());
    }
    @Test
    public void api_02(){
        Class<Person> personClass = Person.class;
        System.out.println(personClass);
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName()+"修饰符"+declaredField.getModifiers()+
                    " 属性的类型"+declaredField.getType());
        }
        System.out.println("=================================");

        //   getDeclaredMethods:获取本类中所有方法
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod+"修饰符"+declaredMethod.getModifiers());

            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("形参 ："+parameterType);
            }
        }

//        8.getDeclaredConstructors:获取本类中所有构造器
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor+" 修饰符 ："+declaredConstructor.getModifiers());

            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("形参 ："+parameterType);
            }
        }

    }
}
interface IA{}
interface IB{}
class A{
    public String work ;
    public A(){
    }
    public void m(){}
}
@Deprecated
class Person extends A implements IA,IB{
    public String name;
    protected int age;
    String hobby;
    private double sal;

    public Person(){}

    private Person(String name){}

    public Person(String name,int age,double sal){

    }

    public void m1(String name,int age,float sal){}

    protected void m2(double sal){
    }

    void m3(){
    }

    private void m4(){}
}
