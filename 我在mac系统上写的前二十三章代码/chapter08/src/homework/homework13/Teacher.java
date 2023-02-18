package homework.homework13;

/**
 * @author 王凯
 * @version 1.0
 */
public class Teacher extends Person{
    private int work_age;

    @Override
    public String play() {
        return super.play()+"象棋";
    }

    public void teach(){
        System.out.println("我承诺我会认真教学。");
    }

    public Teacher(String name, int age, char sex, int work_age) {
        super(name, age, sex);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void printInfo() {
        System.out.println("老师的信息:");
        System.out.println(super.basicInfo());
        System.out.println("工龄: "+work_age);
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return super.toString()+"Teacher{" +
                "work_age=" + work_age +
                '}';
    }
}
