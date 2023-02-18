package polymorphic.polyparameter;

/**
 * @author 王凯
 * @version 1.0
 */
public class PolyParameter {
    public static void main(String[] args) {
        Employee e1 = new NormalEmployee("张三",4500);
        Employee e2 = new Manager("乔布斯",25000,200000);
        showEmpAnnal(e1);
        System.out.println("==================");
        showEmpAnnal(e2);
        System.out.println("==================");

        testWork(e1);
        System.out.println("==================");
        testWork(e2);

    }

    public static void showEmpAnnal(Employee e){ //如果传进来的对象编译类型是Employee的子类就会自动向上转型
        System.out.println("员工："+e.getName()+" 今年的年薪总共是："+e.getAnnual()+"元");
    }

    public static void testWork(Employee e){
        if (e instanceof NormalEmployee){
            ((NormalEmployee) e).work();
        } else if (e instanceof Manager) {
            ((Manager)e).manage();
        }
    }
}


