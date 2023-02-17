package map_;

import java.util.*;

/**
 * @author 王凯
 * @version 1.0
 */
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","jack");
        map.put("no2","rose");
        map.put("no3","tom");
        map.put("no4","jerry");
        map.put("no5","milan");

        Set keySet = map.keySet();
        for (Object o:keySet
             ) {
            System.out.println(o+"-"+map.get(o));
        }

        System.out.println("==========================");

        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next+"-"+map.get(next));

        }

        System.out.println("==========================");

        Collection values = map.values();
        for (Object o:values
             ) {
            System.out.println(o);
        }

        System.out.println("==========================");

        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }

        System.out.println("==========================");

        Set entrySet = map.entrySet();
        for (Object o:entrySet
             ) {
            Map.Entry entry  = (Map.Entry)o;
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        System.out.println("==========================");

        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            Map.Entry entry = (Map.Entry) next;
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }
}
