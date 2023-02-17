package homework.homework05;

/**
 * @author 王凯
 * @version 1.0
 */
public class Scientist extends Employee{
    private double bonus;

    @Override
    public void printSalary() {
        System.out.println("科学家 "+getName()+" 年龄 "+getAge()+" 全年工资 "+(getBasicSalary()*getSalMonth()+bonus));
    }

    public Scientist(String name, int age, double basicSalary) {
        super(name, age, basicSalary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
