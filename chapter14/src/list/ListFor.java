package list;

import java.util.*;

/**
 * @author 王凯
 * @version 1.0
 */
public class ListFor {
    public static void main(String[] args) {
        //List list = new Vector();
       // List list = new ArrayList();
        List list = new LinkedList();
        list.add("jack");
        list.add("Tom");
        list.add("jerry");
        list.add("rose");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Object o:list){
            System.out.println(o);
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
