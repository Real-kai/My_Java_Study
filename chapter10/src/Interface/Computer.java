package Interface;

/**
 * @author 王凯
 * @version 1.0
 */
public class Computer {
    public void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.stop();
    }
}

