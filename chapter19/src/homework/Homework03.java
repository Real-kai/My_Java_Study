package homework;

import java.io.*;
import java.util.Properties;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.load(new FileReader("/Users/kai/IdeaProjects/hspedu/chapter19/src/Dog.properties"));
        Dog dog = new Dog(properties.getProperty("name"), Integer.parseInt(properties.getProperty("age")), properties.getProperty("color"));
        properties.list(System.out);
        System.out.println("===================");
        System.out.println(dog);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/dog.txt"));
        oos.writeObject(dog);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/dog.txt"));
        System.out.println(ois.readObject());
        ois.close();
    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
