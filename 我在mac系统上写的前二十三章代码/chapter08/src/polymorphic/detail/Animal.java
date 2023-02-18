package polymorphic.detail;

/**
 * @author 王凯
 * @version 1.0
 */
public class Animal {
    String name="动物";
    int age = 18;

    public void sleep(){
        System.out.println("睡...");
    }

    public void run(){
        System.out.println("跑...");
    }

    public void eat(){
        System.out.println("吃...");
    }

    public void show(){
        System.out.println("hello,你好...");
    }
}
