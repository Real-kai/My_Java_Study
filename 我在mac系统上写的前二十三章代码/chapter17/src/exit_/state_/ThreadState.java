package exit_.state_;

/**
 * @author 王凯
 * @version 1.0
 */
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        System.out.println(t.getName()+"现在的状态是"+t.getState());
        t.start();
        while( t.getState()!=Thread.State.TERMINATED){
            System.out.println(t.getName()+"现在的状态是"+t.getState());
            Thread.sleep(500);
        }

        System.out.println(t.getName()+"现在的状态是"+t.getState());
    }
}
class T extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
