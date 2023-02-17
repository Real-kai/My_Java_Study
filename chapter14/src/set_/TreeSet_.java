package set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 王凯
 * @version 1.0
 */
public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o2).length()-((String)o1).length();
            }
        });
        treeSet.add("javkka");
        treeSet.add("packk");
        treeSet.add("rose");
        treeSet.add("tom");
        treeSet.add("abc");
        System.out.println(treeSet);
    }
}
