package Enacap;

/**
 * @author 王凯
 * @version 1.0
 */
public class Enacap01 {
    public static void main(String[] args) {
        Person p = new Person("王凯",18,12000,"开发师");
//        p.setAge(110);
//        p.setName("王凯");
//        p.setSalary(12000);
//        p.setJob("程序开发师");

        p.info();

    }
}
class Person{
    private String name;
    private int age;
    private double salary;
    private String job;

    public Person() {
    }

    //将set方法和构造起结合在一起
    public Person(String name, int age, double salary, String job) {
       setName(name);
       setAge(age);
       setJob(job);
       setSalary(salary);
    }

    //    public Person(String name,int age,double salary,String job){
//        this.name = name;
//        this.age = age;
//        this.salary=salary;
//        this.job=job;
//    }
    public void setName(String name){

        if (name.length()>=2&&name.length()<=6){this.name = name;}
        else{
            System.out.println("名字的长度在2-6之间，请重新设置");
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if (age>=1&&age<=120){this.age=age;}
        else{
            System.out.println("年龄的范围在1-120岁之间，请重新设置,给你一个默认年龄（18）");
            this.age=18;
        }
    }

    public int getAge(){
        return age;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setJob(String job){
        this.job=job;
    }
    public String getJob(){
        return job;
    }
    public void info(){
        System.out.println("姓名："+name+"， 年龄"+age+"， 薪水"+salary+"， 工作："+job);
    }
}
