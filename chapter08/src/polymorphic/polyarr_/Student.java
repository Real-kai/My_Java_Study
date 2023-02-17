package polymorphic.polyarr_;

/**
 * @author 王凯
 * @version 1.0
 */
public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public String say() {
        return super.say()+"\t"+score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void study(){
        System.out.println("学生："+getName()+" 年龄："+getAge()+" 正在努力学习中...."+" 结果这次考试考了"+score+"分");
    }
}
