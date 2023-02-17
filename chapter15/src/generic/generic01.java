package generic;

import java.util.ArrayList;

/**
 * @author 王凯
 * @version 1.0
 */
public class generic01 {
    public static void main(String[] args) {
        ArrayList<Dog> list = new ArrayList();
        list.add(new Dog("旺财",11));
        list.add(new Dog("阿黄",1));
        list.add(new Dog("小白",2));

//        for (Object o :list
//             ) {
//           Dog dog = (Dog)o;
//            System.out.println(dog.getName()+"-"+dog.getAge());
//        }
        for (Dog dog :list) {
            System.out.println(dog.getName()+"-"+dog.getAge());
        }

    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
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
}
