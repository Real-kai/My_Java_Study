package homework;

import java.util.ArrayList;

/**
 * @author 王凯
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        String name = "Wang Kai Jing";
        System.out.println(name(name));

        printName(name);
    }

    public static String name(String name){
        int[] arr = new int[3];
        int j = 0;
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])){
                arr[j] =i;
                j++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = arr[2]; i < chars.length; i++) {
            sb.append(chars[i]);
        }
        sb.append(',');

        for (int i = arr[0]; i <arr[1] ; i++) {
            sb.append(chars[i]);
        }
        sb.append(" .").append(chars[arr[1]]);

        return new String(sb);
    }

    public static void printName(String name){
        if (name == null){
            System.out.println("字符串不能为空");
            return;
        }

        String[] s = name.split(" ");
        if (s.length!=3){
            System.out.println("输入的格式不正确");
            return;
        }

        String s1 = String.format("%s,%s .%c", s[2], s[0], s[1].toUpperCase().charAt(0));
        System.out.println(s1);
    }
}
