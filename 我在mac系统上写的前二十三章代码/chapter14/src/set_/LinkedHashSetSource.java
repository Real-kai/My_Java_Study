package set_;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author 王凯
 * @version 1.0
 */
public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add("jack");
        set.add(123);
        set.add("tom");
        set.add("java");

        System.out.println(set);
    }
}
