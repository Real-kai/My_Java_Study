package homework.homework05;

/**
 * @author 王凯
 * @version 1.0
 */
public class Peasant extends Employee{
    public Peasant(String name, int age, double basicSalary) {
        super(name, age, basicSalary);
    }

    @Override
    public void printSalary() {
        System.out.print("农民 ");
        super.printSalary();
    }
}
