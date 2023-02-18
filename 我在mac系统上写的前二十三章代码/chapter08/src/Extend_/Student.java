package Extend_;

/**
 * @author 王凯
 * @version 1.0
 */
public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo(){
        System.out.println("姓名："+name+" 年龄："+age+" 考试成绩："+score);
    }
}
