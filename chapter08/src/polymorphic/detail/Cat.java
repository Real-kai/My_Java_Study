package polymorphic.detail;

/**
 * @author 王凯
 * @version 1.0
 */
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
