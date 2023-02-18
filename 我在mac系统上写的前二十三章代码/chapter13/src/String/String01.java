package String;

/**
 * @author 王凯
 * @version 1.0
 */
public class String01 {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = "ab"+"c";
        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str==str2);
        System.out.println(str.intern());
        byte[] bytes = str.getBytes();
        byte[] i1 = {13,23,44};
        bytes[0] = 98;
        System.out.println(str);
        System.out.println(bytes[0]);//97
        final char[] value ={'a','b','c'};
        value[0] = 'q';
        char[] i = {'e','f','g'};
    }
}
