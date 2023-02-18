package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 王凯
 * @version 1.0
 */
public class ListExercise {
    public static void main(String[] args) {
        List list  = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("Hello"+i);
        }
        System.out.println(list);
        list.add(2,"韩顺平教育");
        Object o = list.get(4);
        list.remove(5);
        list.set(6,"jack");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }


    }
}
