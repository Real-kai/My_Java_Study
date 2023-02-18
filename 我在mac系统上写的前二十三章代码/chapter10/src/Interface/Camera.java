package Interface;

/**
 * @author 王凯
 * @version 1.0
 */
public class Camera implements UsbInterface {
    @Override
    public void start() {
        System.out.println("相机开始工作了....");
    }

    @Override
    public void stop() {
        System.out.println("相机结束工作了....");
    }
}

