package map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author 王凯
 * @version 1.0
 */
public class TreeMap_ {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).length()-((String) o1).length();
            }
        });
        treeMap.put("001","jack");
        treeMap.put("02","tom");
        treeMap.put("00003","rose");
        treeMap.put("0004","july");
        treeMap.put("002","smith");//会把001=jack 替换成001=smith
        System.out.println(treeMap);
    }
}
