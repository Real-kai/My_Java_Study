package polymorphic.objpoly;

/**
 * @author 王凯
 * @version 1.0
 */
public class PolyObject {
    public static void main(String[] args) {
        Animal animal = new Dog();//编译运行Animal  运行类型Dog
        animal.cry();
        animal = new Cat();
        animal.cry();//此时运行类型是Cat  所以执行的是Cat类里的cry()方法

    }
}
