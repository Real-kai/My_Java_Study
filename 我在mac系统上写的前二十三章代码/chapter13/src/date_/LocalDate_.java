package date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

/**
 * @author 王凯
 * @version 1.0
 */
public class LocalDate_ {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getYear()+"年"+ldt.getMonth()+ldt.getMonthValue()+"月"
        +ldt.getDayOfMonth()+"日"+ldt.getHour()+"时"+ldt.getMinute()+"分"+ldt.getSecond()+"秒");
    }
}
