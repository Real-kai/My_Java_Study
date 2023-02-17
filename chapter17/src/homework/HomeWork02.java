package homework;

import javax.swing.plaf.TableHeaderUI;

/**
 * @author 王凯
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        Money money = new Money();
        Thread thread = new Thread(money);
        thread.setName("用户一");
        Thread thread1 = new Thread(money);
        thread1.setName("用户二");

        thread.start();
        thread1.start();

    }
}

class Money implements Runnable{
    private double balance=10000;

 
    @Override
    public void run() {

        while(true) {
          synchronized (this) {
              if (balance == 0) {
                  System.out.println("余额不足,无法取钱");
                  break;
              }
              System.out.println(Thread.currentThread().getName() + "取了1000元，余额:" + (balance -= 1000));
          }

           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }

       }}
}

