package draw.tankgame;

/**
 * @author 王凯
 * @version 1.0
 */
public class Boom extends Thread{
    public static boolean a = false;
    @Override
    public void run() {
        a= true;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        a= false;
    }
}
