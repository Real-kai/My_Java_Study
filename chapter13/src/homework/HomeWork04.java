package homework;

/**
 * @author 王凯
 * @version 1.0
 */
public class HomeWork04 {
    public static void main(String[] args) {
        count("sdfdsABC1234");
    }

    public static void count(String str){
        if (str == null){
            System.out.println("字符串不能为空");
            return;
        }
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>='A'&&chars[i]<='Z'){
                i1++;
            }

            if (chars[i]>='a'&&chars[i]<='z'){
                i2++;
            }
            if (chars[i]>='0'&&chars[i]<='9'){
                i3++;
            }
        }

        String format = String.format("大写字母有%d个 小写字母有%d个 数字有%d个", i1, i2, i3);
        System.out.println(format);
    }
}

