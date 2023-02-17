package list;

import java.util.Vector;

/**
 * @author 王凯
 * @version 1.0
 */
public class Vector_ {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }

        vector.add(100);
    }
}
