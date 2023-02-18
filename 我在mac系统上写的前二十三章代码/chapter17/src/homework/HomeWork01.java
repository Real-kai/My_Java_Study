package homework;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Calendar;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 王凯
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }

}

class A extends Thread{
    private boolean loop = true;

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while(loop){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(new Random().nextInt(1,100));
        }
        System.out.println("A线程退出");
    }
}
class B extends Thread{
    private A a;

    public B(A a) {
        this.a = a;
    }

    private Scanner sc  = new Scanner(System.in);

    @Override
    public void run() {
        while(true){
        System.out.println("请输入你的值:");
        char c = sc.next().toUpperCase().charAt(0);
        if (c=='Q'){
            a.setLoop(false);
            System.out.println("b线程退出...");
            break;
                            }
    }}
}
