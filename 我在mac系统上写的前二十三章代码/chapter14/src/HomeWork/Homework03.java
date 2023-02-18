package HomeWork;

import java.util.*;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        Employee jack = new Employee("jack", 3500);
        Employee tom = new Employee("tom", 4500);
        Employee smith = new Employee("smith", 34000);

        map.put(jack.getName(),jack.getSal());
        map.put(tom.getName(),tom.getSal());
        map.put(smith.getName(),smith.getSal());
        System.out.println(map);

        jack.setSal(2600);
        map.put(jack.getName(),jack.getSal());
        System.out.println(map);

        //所有员工工资+100 方法一
//        map.replace(jack.getName(),jack.getSal()+100);
//        map.replace(tom.getName(),tom.getSal()+100);
//        map.replace(smith.getName(),smith.getSal()+100);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Map.Entry entry = (Map.Entry) next;
           // 所有员工工资+100 方法二
            double value = (Double)entry.getValue();
            entry.setValue(value+100);
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("========================");

        Collection values = map.values();
        for (Object o :values
             ) {
            System.out.println(o);
        }
        System.out.println("========================");

        Set keySet = map.keySet();
        for (Object o:keySet
             ) {
            System.out.println(o+" "+map.get(o));
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("tok");
        System.out.println(treeSet);
    }
}
class Employee{
    private String name;
    private double sal;

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
