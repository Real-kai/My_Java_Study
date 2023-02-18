package exit_;

/**
 * @author 王凯
 * @version 1.0
 */
public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();

        Thread.sleep(10*1000);
        t.setLoop(false);
    }
}

class T extends Thread{
    private int count ;
    private boolean loop = true;
    @Override
    public void run() {
        while(loop){
        System.out.println("T运行中......"+(++count));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }}

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
