package list;

import java.util.ArrayList;

/**
 * @author 王凯
 * @version 1.0
 */
public class ArrayListSource {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        for (int i = 11; i <=15 ; i++) {
            list.add(i);
        }

    }
}
