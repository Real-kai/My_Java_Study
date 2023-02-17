package homework.homework05;

/**
 * @author 王凯
 * @version 1.0
 */
public class Waiter extends Employee{
    public Waiter(String name, int age, double basicSalary) {
        super(name, age, basicSalary);
    }

    @Override
    public void printSalary() {
        System.out.print("服务员 ");
        super.printSalary();
    }
}
