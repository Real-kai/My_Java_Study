package homework.homework05;

/**
 * @author 王凯
 * @version 1.0
 */
public class Worker extends Employee{
    public Worker(String name, int age, double basicSalary) {
        super(name, age, basicSalary);
    }

    @Override
    public void printSalary() {
        System.out.print("工人 ");
        super.printSalary();
    }
}
