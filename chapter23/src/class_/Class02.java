package class_;

import java.lang.reflect.Field;

/**
 * @author 王凯
 * @version 1.0
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classFullPath = "reflection.question.Car";

        Class<?> cls = Class.forName(classFullPath);

        System.out.println(cls);
        System.out.println(cls.getClass());
        System.out.println(cls.getPackage().getName());
        System.out.println(cls.getName());

        Object o = cls.newInstance();
        System.out.println(o);

        Field brand = cls.getField("brand");
        System.out.println(brand.get(o));
        brand.set(o,"奔驰");
        System.out.println(brand.get(o));

        System.out.println("===========================");
        Field[] fields = cls.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].get(o));
        }
    }
}
