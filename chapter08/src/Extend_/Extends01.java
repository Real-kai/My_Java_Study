package Extend_;

/**
 * @author 王凯
 * @version 1.0
 */
public class Extends01 {
    public static void main(String[] args) {
        //小学生 继承了学生类
        Pupil pupil = new Pupil();
        pupil.name = "张三";
        pupil.age = 9;
        pupil.testing();
        pupil.setScore(100);
        pupil.showInfo();
        System.out.println("=============================");

        //大学生 继承了学生类
        Graduate g = new Graduate();
        g.name="李四";
        g.age=20;
        g.testing();
        g.setScore(67);
        g.showInfo();

    }
}
