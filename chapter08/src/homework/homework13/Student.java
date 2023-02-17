package homework.homework13;

/**
 * @author 王凯
 * @version 1.0
 */
public class Student extends Person{
    private int stu_id;

    public void study(){
        System.out.println("我承诺我会好好学习......");
    }

    @Override
    public String play() {
        return super.play()+"足球";
    }

    public Student(String name, int age, char sex, int stu_id) {
        super(name, age, sex);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public void printInfo() {
        System.out.println("学生的信息:");
        System.out.println(super.basicInfo());
        System.out.println("学号: "+stu_id);
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "stu_id=" + stu_id +
                '}';
    }
}
