package list;

/**
 * @author 王凯
 * @version 1.0
 */
public class LinkList_ {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node rose = new Node("rose");

        Node zhang = new Node("张飞");
        tom.next = zhang;
        rose.prv = zhang;
        zhang.next = rose;
        zhang.prv = tom;

        jack.next = tom;
       // tom.next = rose;

      //  rose.prv = tom;
        tom.prv = jack;

        Node first = jack;
        Node last = rose;

        while(true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        while(true){
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.prv;
        }
    }
}
class Node{
    Node next;
    Object name;
    Node prv;

    public Node(Object name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name=" + name +
                '}';
    }
}
