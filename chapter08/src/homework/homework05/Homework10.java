package homework.homework05;

import java.util.Objects;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack", 18, "骨科医生", '男', 20000);
        Doctor doctor2 = new Doctor("jack", 18, "骨科医生", '男', 20000);
        System.out.println(doctor1.equals(doctor2));//false  重写equals方法前
        System.out.println(doctor1.equals(doctor2));//true 重写了equals方法

    }
}
class Doctor{
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    @Override
    public boolean equals(Object o){
        if (this==o)return true;
        if (o==null||this.getClass()!=o.getClass())return false;
        Doctor doctor = (Doctor)o;
        return age == doctor.age&&sal==doctor.sal&&name.equals(doctor.name)&&gender==doctor.gender&&job.equals(doctor.job);
   }


    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
