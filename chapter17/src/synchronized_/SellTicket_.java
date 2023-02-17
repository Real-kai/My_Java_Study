package synchronized_;

import java.awt.event.HierarchyBoundsAdapter;

/**
 * @author 王凯
 * @version 1.0
 */
public class SellTicket_ {
    public static void main(String[] args) {
//       SellTicket sellTicket = new SellTicket();
//       SellTicket sellTicket1 = new SellTicket();
//        SellTicket sellTicket2 = new SellTicket();
//        sellTicket.start();
//        sellTicket1.start();
//        sellTicket2.start();

//        SellTicket02 sellTicket02 = new SellTicket02();
//       new Thread(sellTicket02).start();
//       new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();

              SellTicket03 sellTicket03 = new SellTicket03();
              new Thread(sellTicket03).start();
             new Thread(sellTicket03).start();
              new Thread(sellTicket03).start();

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

class SellTicket03 implements Runnable{
    private int ticketNum=100;
    private boolean loop=true;

    private Object obj = new Object();

    public /*synchronized*/ static void m(){
        synchronized (SellTicket03.class){System.out.println("hi");}
    }

    public /*synchronized*/ void sell(){
        synchronized (obj){
        if (ticketNum==0){
            System.out.println("票已售光");
            loop = false;
            return;
        }
        System.out.println(Thread.currentThread().getName()+"卖出了一张票，还剩"+(--ticketNum)+"张票");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }}

    }

    @Override
    public  void run() {
        while (loop){
           sell();
        }
    }
}

