package polymorphic.polyparameter;

/**
 * @author 王凯
 * @version 1.0
 */
public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getAnnual(){
        return super.getAnnual()+bonus;
    }

    public void manage(){
        System.out.println("name= "+getName()+" 正在管理员工......");
    }
}
