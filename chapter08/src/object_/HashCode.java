package object_;

/**
 * @author 王凯
 * @version 1.0
 */
public class HashCode {
    public static void main(String[] args) {
        AA aa1 = new AA();
        AA aa2 = new AA();
        AA aa3 = aa1;
        System.out.println(aa1.hashCode());
        System.out.println(aa2.hashCode());
        System.out.println(aa3.hashCode());

    }
}
class AA{}
