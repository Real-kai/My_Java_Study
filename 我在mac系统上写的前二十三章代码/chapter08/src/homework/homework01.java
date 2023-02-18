package homework;

/**
 * @author 王凯
 * @version 1.0
 */
public class homework01 {
    public static void main(String[] args) {
        Person p1 = new Person("王凯smith",18,"程序员");
        Person p2 = new Person("张三jj",32,"律师");
        Person p3 = new Person("赵四",45,"农名");
        Person[] arr = {p1,p2,p3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("=========================");
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                Person temp;
                if (arr[j].getAge()<arr[j+1].getAge()){
                //if (arr[j].getName().length()>arr[j+1].getName().length()){
                    temp = arr[j];arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
