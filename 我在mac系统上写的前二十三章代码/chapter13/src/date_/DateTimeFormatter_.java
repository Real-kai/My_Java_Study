package date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 王凯
 * @version 1.0
 */
public class DateTimeFormatter_ {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String s = dtf.format(LocalDateTime.now());
        System.out.println(s);
    }
}
