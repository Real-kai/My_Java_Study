package map_;

import java.util.Hashtable;

/**
 * @author 王凯
 * @version 1.0
 */
public class Hashtable_ {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        for (int i = 1; i <=9 ; i++) {
            hashtable.put(i,i);
        }

        for (int i = 1; i-- >0;) {
            System.out.println(i);
        }
    }
}
