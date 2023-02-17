package polymorphic.polyarr_;

/**
 * @author 王凯
 * @version 1.0
 */
public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    @Override
    public String say() {
        return super.say()+"\t"+salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void teach(){
        System.out.println("老师："+getName()+" 年龄："+getAge()+" 正在努力教学中..."+" 结果这次工资拿了"+salary+"元");
    }
}
