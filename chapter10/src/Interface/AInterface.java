package Interface;

/**
 * @author 王凯
 * @version 1.0
 */
public interface AInterface {
     int num = 10;
    void hi();
    default  void say(){
        System.out.println("hi");
    }
    static void hello(){
        System.out.println("hello");
    }
}
