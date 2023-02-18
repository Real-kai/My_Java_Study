package reflection.ClassLoad;

/**
 * @author 王凯
 * @version 1.0
 */
public class Thread_ extends Thread{
    @Override
    public void run() {
        System.out.println(Clinit.n);
    }
}
