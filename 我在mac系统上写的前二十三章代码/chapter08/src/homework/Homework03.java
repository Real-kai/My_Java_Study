package homework;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Teacher t1 = new professor("王凯",47,"教授",13000);
        Teacher t2 = new AssociateProfessor("张三",40,"副教授",12000);
        Teacher t3 = new Lecturer("smith",38,"讲师",11000);
        t1.introduce();
        t2.introduce();
        t3.introduce();
    }
}
class Teacher{
    private String name;
    private int age;
    private String post;
    private double salary;


    public void introduce(){
        System.out.println("姓名:"+name+"\t年龄:"+age+"\t职称:"+post+"\t工资:"+salary);
    }

    public Teacher(String name, int age, String post,double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class professor extends Teacher {
    public professor(String name, int age, String post,double salary) {
        super(name, age, post,salary);
    }


    @Override
    public void introduce() {
        System.out.println("教授:"+getName()+"\t年龄:"+getAge()+"\t职称:"+getPost()+"\t工资:"+getSalary());
    }

}

class AssociateProfessor extends Teacher{
    public AssociateProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("副教授:"+getName()+"\t年龄:"+getAge()+"\t职称:"+getPost()+"\t工资:"+getSalary());
    }
}
class Lecturer extends Teacher{
    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("讲师:"+getName()+"\t年龄:"+getAge()+"\t职称:"+getPost()+"\t工资:"+getSalary());
    }
}