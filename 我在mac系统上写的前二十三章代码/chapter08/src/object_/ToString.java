package object_;

/**
 * @author 王凯
 * @version 1.0
 */
public class ToString {
    public static void main(String[] args) {
        Monster mst = new Monster("小妖怪","抓害虫",1000);
        System.out.println(mst.toString());
        System.out.println(mst.hashCode());
        System.out.println(mst);
    }
}
class Monster{
    private String name;
    private String job;
    private double sal;

    public String toString(){
        return "name= "+name+"job= "+job+"sal= "+sal;
    }

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}

