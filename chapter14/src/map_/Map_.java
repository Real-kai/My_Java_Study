package map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;



/**
 * @author 王凯
 * @version 1.0
 */
public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1",1);
        map.put("no2",2);
        map.put("no1","wangkai");
        System.out.println(map);

        Set set = map.entrySet();
        for (Object obj : set) {
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        Set set1 = map.keySet();
        for (Object o :
                set1) {
            System.out.println(o);
        }

        Collection values = map.values();
        for (Object o :values
             ) {
            System.out.println(o);
        }


    }
}
