package synchronized_;

/**
 * @author 王凯
 * @version 1.0
 */
public class DeadLock {
    public static void main(String[] args) {
        DeadLockThread a  = new DeadLockThread(true);
        a.setName("A线程");
        DeadLockThread b  = new DeadLockThread(false);
        b.setName("B线程");
        a.start();
        b.start();

    }
}

class DeadLockThread extends Thread{
    private static Object o1 = new Object();
    private static Object o2 = new Object();
    private boolean flag;

    public DeadLockThread(boolean flag){
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag){
            synchronized (o1){
                System.out.println(Thread.currentThread().getName()+"进入了1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName()+"进入了2");
                }
            }
        }
        else
        {
            synchronized (o2){
                System.out.println(Thread.currentThread().getName()+"进入了3");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName()+"进入了4");
                }
            }
        }
    }
}
