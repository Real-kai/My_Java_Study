package thread;

/**
 * @author 王凯
 * @version 1.0
 */
public class Thread02 {
    public static void main(String[] args) {
        T t = new T();
        Thread thread = new Thread(t);
        thread.start();
    }
}
class T implements Runnable{
    private int times;

    @Override
    public void run() {
        while(true){
            System.out.println("hi"+(++times)+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 10){break;}
        }
    }
}
