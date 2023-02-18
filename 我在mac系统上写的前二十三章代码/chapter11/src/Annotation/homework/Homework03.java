package Annotation.homework;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public void shot() {
                System.out.println("狗会汪汪叫");
            }
        };dog.shot();

        Animal cat = new Animal() {
            @Override
            public void shot() {
                System.out.println("猫会喵喵叫");
            }
        };cat.shot();
    }
}
abstract class Animal{
    public abstract void shot();
}
