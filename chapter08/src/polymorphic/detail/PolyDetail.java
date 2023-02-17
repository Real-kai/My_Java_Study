package polymorphic.detail;

/**
 * @author 王凯
 * @version 1.0
 */
public class PolyDetail {
    public static void main(String[] args) {
        //向上转型 父类引用指向子类对象
        Animal animal = new Cat();
        //Object obj = new Cat();  这个也可以 因为是所有类的父类

        //可以调用父类中的所有成员(需要遵守权限)  但不能调用子类的特有成员
        animal.eat();
        //因为在编译阶段，能调用哪些成员是由编译类型决定
        //animal.catchMouse;发生错误
        //最终运行效果看子类的具体实现
        animal.eat();//调用的子类的重写eat()方法
        animal.show();
        animal.sleep();
        animal.run();

        //多态的向下转型
        Cat cat = (Cat)animal;
        cat.catchMouse();
        Dog dog = (Dog)animal;//可以吗？  不可以 因为 原先的父类引用没有指向狗类对象而是猫类对象。
        //ClassCastException
    }
}
