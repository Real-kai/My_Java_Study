package class_;

import reflection.question.Car;

/**
 * @author 王凯
 * @version 1.0
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        String classPath = "reflection.question.Car";
        //1
        Class<?> cls1 = Class.forName(classPath);
        System.out.println(cls1);
        //2
        Class<Car> cls2 = Car.class;
        System.out.println(cls2);
        //3
        Car car = new Car();
        Class<? extends Car> cls3 = car.getClass();
        System.out.println(cls3);
        //4
        ClassLoader classLoader = cls3.getClassLoader();
        Class<?> cls4 = classLoader.loadClass(classPath);
        System.out.println(cls4);
        //5
        Class<Integer> integerClass = int.class;
        System.out.println(integerClass);
        //6
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);
        System.out.println(integerClass.equals(type));


    }
}
