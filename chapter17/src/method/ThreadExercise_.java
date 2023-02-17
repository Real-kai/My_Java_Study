package method;

/**
 * @author 王凯
 * @version 1.0
 */
public class ThreadExercise_ {
    public static void main(String[] args) throws InterruptedException {
        B b = new B();
        Thread thread = new Thread(b);
        for (int i = 1; i <= 10 ; i++) {
            Thread.sleep(1000);
            System.out.println("hi"+i);
            if (i==5){thread.start();
            thread.join();}
        }
    }
}
class B implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hello"+i);
        }
    }
}
