package Interface;

/**
 * @author 王凯
 * @version 1.0
 */
public class InterfacePolyParameter {
    public static void main(String[] args) {
        IF if01 = new BBB();
        if01 = new CCC();
    }
}
interface IF{}
class BBB implements IF{}
class CCC implements IF{}
