package date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 王凯
 * @version 1.0
 */
public class PlusAndMinus {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = ldt.plusYears(50).plusMonths(6).plusDays(340).plusHours(5).minusYears(5).minusDays(230);
        System.out.println(ldt2);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(dtf.format(ldt2));

    }
}
