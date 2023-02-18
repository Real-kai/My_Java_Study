package date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author 王凯
 * @version 1.0
 */
public class Date {
    public static void main(String[] args) throws ParseException {
        System.out.println(new java.util.Date());
        System.out.println(new java.util.Date(77656554));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String s = simpleDateFormat.format(new java.util.Date());
        System.out.println(s);
        java.util.Date date = simpleDateFormat.parse("1996年09月30日 19:30:45 星期二");
        System.out.println(simpleDateFormat.format(date));

    }
}
