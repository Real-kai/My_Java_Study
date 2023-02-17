package date_;

import java.time.Instant;
import java.util.Date;

/**
 * @author 王凯
 * @version 1.0
 */
public class Instant_ {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        Date date = Date.from(now);
        Instant instant = date.toInstant();

    }
}
