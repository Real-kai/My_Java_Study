package homework.homework05;

/**
 * @author 王凯
 * @version 1.0
 */
public class Teacher extends Employee{
    private double daySalary;
    private int workDays;

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public Teacher(String name, int age, double basicSalary) {
        super(name, age, basicSalary);

    }

    @Override
    public void printSalary() {
        System.out.println("教师 "+getName()+" 年龄 "+getAge()+" 全年工资 "+(getBasicSalary()*getSalMonth()+workDays*daySalary));
    }
}
