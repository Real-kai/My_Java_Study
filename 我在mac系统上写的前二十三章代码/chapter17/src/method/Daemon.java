package method;

/**
 * @author 王凯
 * @version 1.0
 */
public class Daemon {
    public static void main(String[] args) throws InterruptedException {
        ThreadDaemon threadDaemon = new ThreadDaemon();
        threadDaemon.setDaemon(true);
        threadDaemon.start();
        for (int i = 1; i <=10 ; i++) {
            System.out.println("宝强辛苦地工作...");
            Thread.sleep(1000);
        }
    }
}

class ThreadDaemon extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("宋喆和马蓉正在快乐地聊天...哈哈哈");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
