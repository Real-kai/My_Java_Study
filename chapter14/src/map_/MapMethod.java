package map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王凯
 * @version 1.0
 */
public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","jack");
        map.put("no2","rose");
        map.put("no3","tom");
        map.put("no2","milan");
        System.out.println(map);

        map.remove("no2");
        System.out.println(map);

        Object no3 = map.get("no3");
        System.out.println(no3);

        System.out.println(map.size());

        System.out.println(map.isEmpty());//f

        System.out.println(map.containsKey("no3"));//true

        map.clear();
        System.out.println(map);
    }
}
