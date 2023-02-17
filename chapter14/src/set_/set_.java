package set_;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 王凯
 * @version 1.0
 */
public class set_ {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("jack");
        set.add("marry");
        set.add(null);
        set.add("tom");
        System.out.println(set);

        set.remove(null);
        System.out.println(set);

        System.out.println(set.isEmpty());

        Object[] objects = set.toArray();
        System.out.println(Arrays.toString(objects));

        boolean equals = set.equals("jack");
        System.out.println(equals);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        for (Object o :set){
            System.out.println(o);
        }
    }
}
