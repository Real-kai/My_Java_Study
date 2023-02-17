package String;

/**
 * @author 王凯
 * @version 1.0
 */
public class StringMethod01 {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "abc";
        System.out.println(b.compareTo(a));
        String formatStr="我的名字是%s 年龄是%d 性别是%c 分数是%.2f";
        String s = String.format(formatStr, "王凯", 25, '男', 98.168);
        System.out.println(s);
    }
}
