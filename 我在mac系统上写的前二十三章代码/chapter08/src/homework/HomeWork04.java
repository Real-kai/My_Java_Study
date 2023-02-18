package homework;

/**
 * @author 王凯
 * @version 1.0
 */
public class HomeWork04 {
    public static void main(String[] args) {
        Manager manager = new Manager("jack",150,30,1.2);
        Worker worker = new Worker("smith",100,30,1.0);
        manager.setBasicSalary(1000);
        manager.printSalary();
        worker.printSalary();
    }
}
class
Employee{
    private String name;
    private double income;
    private int day;

    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Employee(String name, double income, int day, double grade) {
        this.name = name;
        this.income = income;
        this.day = day;
        this.grade = grade;
    }

    public Double salary(){
        return income*day*grade;
    }
    public void printSalary(){
        System.out.println(name+" 工资:"+salary());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
class Manager extends Employee{
    private double basicSalary;

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }



    public Manager(String name, double income, int day,double grade) {
        super(name, income, day,grade);
    }

    @Override
    public void printSalary() {
        System.out.println("经理 "+getName()+" 工资:"+(basicSalary+salary()));
    }
}
class Worker extends Employee{


    public Worker(String name, double income, int day,double grade) {
        super(name, income, day,grade);
    }

    @Override
    public void printSalary() {
        System.out.print("普通员工 ");
        super.printSalary();
    }
}
