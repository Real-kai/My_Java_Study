package homework;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework08 {
    public static void main(String[] args) {
       SavingsAccount sa = new SavingsAccount("王凯",100000);
       sa.deposit(2000);
       sa.deposit(200);
       sa.deposit(100);
       sa.deposit(300);
       sa.printBalance();
       sa.earnMonthlyInterest();
       sa.printBalance();

    }

}
