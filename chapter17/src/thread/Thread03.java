package thread;

/**
 * @author 王凯
 * @version 1.0
 */
public class Thread03 {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        B b = new B();
        Thread thread = new Thread(b);
        Thread thread1 = new Thread(b);
        thread1.start();
        thread.start();
    }
}
class A extends Thread{
    private int count;
    @Override
    public void run() {
        new Thread(new C()).start();
       while (true){
           System.out.println("Hello,World"+(++count)+Thread.currentThread().getName());
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           if (count==100){break;}
       }
    }
}
class C implements Runnable{

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("测试...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class B implements Runnable{
    private int count;
    @Override
    public void run() {
        while (true){
            System.out.println("hi"+(++count)+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count==50){break;}
        }
    }
}
