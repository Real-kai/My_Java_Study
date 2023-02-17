package thread;

/**
 * @author 王凯
 * @version 1.0
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();//只有调用start才会真正的启动子线程，如果调用的是run方法 那么不会启动子线程
       // cat.run();//真正实现多线程机制的方法不是run（）方法 而是private native void start0（）方法 它是本地方法，只能有jvm调用
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
class Cat extends Thread{
    private int times;
    @Override
    public void run() {
        while(true){
        if (times==80){break;}
        System.out.println("喵喵，我是一只小猫猫"+(++times)+Thread.currentThread().getName());
        try {
            this.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }}
    }
}
