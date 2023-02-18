package homework;

import java.util.Arrays;

/**
 * @author 王凯
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        String  s = "abcdefg";
        try {
         s  = reverse(s, 2, 9);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(s);
    }
    public static String reverse(String str,int start,int end){
        if (!(str != null&&start<end&&end<=str.length())){
            throw new RuntimeException("参数不正确");

        }
        char[] chars = str.toCharArray();
        char temp;
        for (int i = start-1, j = end-1; i < j; i++,j--) {
           temp = chars[i];chars[i] = chars[j];chars[j]=temp;
        }
        return String.valueOf(chars);
    }
}
