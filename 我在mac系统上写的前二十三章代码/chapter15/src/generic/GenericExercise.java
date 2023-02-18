package generic;

import java.util.*;

/**
 * @author 王凯
 * @version 1.0
 */
public class GenericExercise {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        map.put("jack",new Student("jack",18));
        map.put("rose",new Student("rose",19));
        map.put("smith",new Student("smith",21));



        Set<Map.Entry<String, Student>> entry = map.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entry.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }
        System.out.println("==========================");

        Set<String> keySet = map.keySet();
        for (String s:keySet
             ) {
            System.out.println(s+"-"+map.get(s));

        }
    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
