package method;

/**
 * @author 王凯
 * @version 1.0
 */
public class ThreadMethod_ {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("王凯");
        t.setPriority(1);

        t.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println(t.getName()+i);
        }
        System.out.println(t.getPriority());
        t.interrupt();
    }
}

class T extends Thread{
    @Override
    public void run() {
        while (true){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"吃包子"+i);
        }
        try {
            System.out.println("休眠中...");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+"被interrupt了");
        }}
    }
}

