package homework.homework05;

/**
 * @author 王凯
 * @version 1.0
 */
public class Employee {
    private String name;
    private int age;
    private double basicSalary;


    private int salMonth=12;

    public void printSalary(){
        System.out.println(name+" 年龄:"+age+" 全年工资:"+basicSalary*salMonth);
    }

    public Employee(String name, int age, double basicSalary) {
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}
