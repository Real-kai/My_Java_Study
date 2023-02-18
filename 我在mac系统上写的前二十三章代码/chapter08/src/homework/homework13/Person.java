package homework.homework13;

/**
 * @author 王凯
 * @version 1.0
 */
public class Person {
    private String name;
    private int age;
    private char sex;

    public String play(){
        return name+" 爱玩";
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String basicInfo(){
        return "姓名: "+name+"\n年龄: "+age+"\n性别: "+sex;
    }
}
