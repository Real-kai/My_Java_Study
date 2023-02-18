package Interface;

/**
 * @author 王凯
 * @version 1.0
 */
public class InterfacePolyArr {
    public static void main(String[] args) {
        UsbInterface[] arr = new UsbInterface[5];
        arr[0] = new Phone();
        arr[1] = new Camera();
        arr[2] = new Camera();
        arr[3] = new Phone();
        arr[4] = new Phone();
        for (int i = 0; i < arr.length; i++) {
           arr[i].start();arr[i].stop();
            if (arr[i] instanceof Phone){
                ((Phone)arr[i]).call();
            }
        }
    }
}
