package polymorphic.polyparameter;

/**
 * @author 王凯
 * @version 1.0
 */
public class NormalEmployee extends Employee{
    public NormalEmployee(String name, double salary) {
        super(name, salary);
    }

    public double getAnnual(){
        return super.getAnnual();
    }

    public void work(){
        System.out.println("name= "+getName()+" 正在努力工作......");
    }
}
