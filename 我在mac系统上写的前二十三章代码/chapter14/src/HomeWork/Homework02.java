package HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Car car1 = new Car("bmw", 340000);
        Car car2 = new Car("benz", 420000);
        Car car3 = new Car("audi", 350000);
        Car car4 = new Car("长城", 120000);
        Car car5 = new Car("保时捷", 1200000);
        ArrayList list2 = new ArrayList();

        list.add(car1);
        list.add(car2);
        list.add(car3);

        list2.add(car4);
        list2.add(car5);

        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.contains(car3));//true

        System.out.println(list.isEmpty());//false

        list.addAll(list2);
        System.out.println(list);

        System.out.println("==========使用迭代器遍历============");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        System.out.println("==========使用增强for遍历============");
        for (Object o:list) {System.out.println(o);}//增强for

        System.out.println("==========使用普通for遍历============");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        boolean b = list.containsAll(list2);

        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());

        list.clear();
        System.out.println(list);

    }
}


class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


