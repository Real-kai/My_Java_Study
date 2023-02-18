package collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 王凯
 * @version 1.0
 */
public class CollectionMethod {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("jack");
        list.add("rose");
        list.add("tom");
        System.out.println(list);

        list.remove(0);
        list.remove("rose");
        System.out.println(list);
        list.add("wangkai");

        System.out.println(list.contains("tom"));//true

        System.out.println(list.size());

        System.out.println(list.isEmpty());//False

        list.clear();
        System.out.println(list);

        ArrayList list2 = new ArrayList();
        list2.add("sanguoyanyi");
        list.add("hongloumeng");
        list.add(10);
        list.addAll(list2);
        list.addAll(1,list2);
        System.out.println(list);

        list.removeAll(list2);

        System.out.println(list);

        System.out.println(list.containsAll(list2));//False
    }
}
