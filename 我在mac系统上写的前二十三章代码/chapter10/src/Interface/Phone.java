package Interface;

/**
 * @author 王凯
 * @version 1.0
 */
public class Phone implements UsbInterface {
    @Override
    public void start() {
        System.out.println("手机开始工作了...");
    }

    @Override
    public void stop() {
        System.out.println("手机结束充电了...");
    }
    public void call(){
        System.out.println("打电话");
    }
}

