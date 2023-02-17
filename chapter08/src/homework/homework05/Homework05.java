package homework.homework05;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 24, 2000);
        jack.printSalary();

        Peasant rose = new Peasant("rose", 20, 1800);
        rose.printSalary();

        Waiter smith = new Waiter("smith", 18, 1500);
        smith.printSalary();

        Teacher jerry = new Teacher("jerry", 32, 3000);
        jerry.setWorkDays(200);
        jerry.setDaySalary(50);
        jerry.setSalMonth(13);
        jerry.printSalary();

        Scientist tom = new Scientist("Tom", 55, 20000);
        tom.setBonus(500000);
        tom.setSalMonth(15);
        tom.printSalary();


    }
}
