package thread;

/**
 * @author 王凯
 * @version 1.0
 */
public class Thread04 {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();
        SellTicket sellTicket1 = new SellTicket();
        SellTicket sellTicket2 = new SellTicket();
        sellTicket.start();
        sellTicket1.start();
        sellTicket2.start();

//        SellTicket02 sellTicket02 = new SellTicket02();
//        Thread thread = new Thread(sellTicket02);
//        Thread thread1 = new Thread(sellTicket02);
//        Thread thread2 = new Thread(sellTicket02);
//        thread.start();
//        thread1.start();
//        thread2.start();

       // sellTicket03.start();

    }
}
class SellTicket extends Thread{
    private static int ticketNum=100;

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"卖出了一张票，还剩"+(--ticketNum)+"张票");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (ticketNum<=0){
                System.out.println("票已售光");
        break;
            }
        }
    }
}

class SellTicket02 implements Runnable{
    private int ticketNum=100;

    @Override
    public void run() {
        while (true){
            System.out.println("卖出了一张票，还剩"+(--ticketNum)+"张票"+Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (ticketNum==0){
                System.out.println("票已售光");
                break;
            }
        }
    }
}
