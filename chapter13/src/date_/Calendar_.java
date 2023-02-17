package date_;

import java.util.Calendar;

/**
 * @author 王凯
 * @version 1.0
 */
public class Calendar_ {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"
                +c.get(Calendar.DAY_OF_MONTH)+"日"
        +c.get(Calendar.HOUR_OF_DAY)+"点"+c.get(Calendar.MINUTE)+"分"+c.get(Calendar.SECOND)+"秒");
    }
}
