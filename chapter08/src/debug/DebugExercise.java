package debug;

/**
 * @author 王凯
 * @version 1.0
 */
public class DebugExercise {
    public static void main(String[] args) {
        Person person = new Person("罗翔", 56);
        System.out.println(person);
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
