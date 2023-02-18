package Annotation.homework.homework06;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", VehiclesFactory.getBoat());
        tang.passRiver();
        tang.common();
        tang.passRiver();
        tang.common();
        tang.passFireMountain();
    }
}
