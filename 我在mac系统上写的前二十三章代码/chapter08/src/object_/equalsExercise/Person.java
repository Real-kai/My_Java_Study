package object_.equalsExercise;

import java.util.Objects;

/**
 * @author 王凯
 * @version 1.0
 */
public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        else if (o instanceof Person){
            Person p = (Person) o;
//            if (this.name.equals(p.name)&&this.age == p.age&&this.gender==p.gender)
//                return true;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }

}
