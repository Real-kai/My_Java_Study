package wrapper;

/**
 * @author 王凯
 * @version 1.0
 */
public class WrapperVsString {
    public static void main(String[] args) {
        //包装类--》String
        Integer i  = 100;
        //方法一
        String str1 = i+"";
        //方法二
        String str2 = i.toString();
        //方法三
        String str3 = String.valueOf(i);

        //String--》包装类
        String str = "12345";
        //方式一：
        Integer i1 = Integer.parseInt(str);//这里也使用了自动装箱 Integer.valueOf
        //方式二
        Integer i2 = new Integer(str);

    }
}
