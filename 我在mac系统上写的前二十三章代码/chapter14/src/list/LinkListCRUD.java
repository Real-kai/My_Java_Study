package list;

import java.util.LinkedList;

/**
 * @author 王凯
 * @version 1.0
 */
public class LinkListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
       linkedList.add(1);
       linkedList.add(2);
       linkedList.add(3);

       linkedList.remove(1);

       linkedList.set(1,999);

       linkedList.get(1);
    }
}
