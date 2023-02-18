package set_;

/**
 * @author 王凯
 * @version 1.0
 */
public class hashSetStructure_ {
    public static void main(String[] args) {
        Node [] node = new Node[16];
        Node jack = new Node("jack", null);
        node[2] = jack;
        Node john = new Node("john", null);
        jack.next  = john;
        Node lucy = new Node("Lucy", null);
        john.next = lucy;
        Node tom = new Node("Tom", null);
        node[3] = tom;

        String s = "java";
        String s1 = "java";
        System.out.println(s.getClass());
        System.out.println(s1.hashCode());
    }
}
class Node{
    Object object;
    Node next;

    public Node(Object object, Node node) {
        this.object = object;
        this.next = node;
    }
}
