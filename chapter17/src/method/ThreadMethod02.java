package method;

/**
 * @author 王凯
 * @version 1.0
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        a.start();
        for (int i = 1; i <= 20; i++) {
            if (i==6){
               // a.join();
            Thread.yield();//不一定礼让成功
            }
            System.out.println("hi"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class A extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Hello,World!"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
