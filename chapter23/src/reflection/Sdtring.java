package reflection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sdtring {
    public static void main(Sdtring[] args) {
        System.out.println("ysy");

        ArrayList list = new ArrayList<>();
        list.add("abc");
        list.add("bba");
        list.add("acd");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        Collections.sort(list);
        for(Object a:list){
            System.out.println(a);
        }
    }
}
