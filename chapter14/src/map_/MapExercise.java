package map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 王凯
 * @version 1.0
 */
public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        Employee jack = new Employee("jack", 7000, 1);
        Employee tom = new Employee("tom", 21200, 2);
        Employee rose = new Employee("rose", 38000, 3);
        Employee jerry = new Employee("jerry", 19000, 4);
        Employee milan = new Employee("milan", 2000, 5);
        Employee lucy = new Employee("lucy", 20000, 6);

        map.put(jack.getId(),jack);
        map.put(tom.getId(),tom);
        map.put(rose.getId(),rose);
        map.put(jerry.getId(),jerry);
        map.put(milan.getId(),milan);
        map.put(lucy.getId(),lucy);

        Set entrySet = map.entrySet();
        for (Object o :entrySet) {
            Map.Entry entry = (Map.Entry)o;
            Object value = entry.getValue();
            Employee ep = (Employee) value;
            if (ep.getSal()>18000){
                System.out.println(entry.getKey()+"-"+entry.getValue());
            }
        }

        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object o =  iterator.next();
            Map.Entry entry = (Map.Entry)o;
            Object value = entry.getValue();
            Employee ep = (Employee) value;
            if (ep.getSal()>18000){
                System.out.println(entry.getKey()+"-"+entry.getValue());
            }
        }

        Set keySet = map.keySet();
        for (Object o : keySet) {

            Object o1 = map.get(o);
            Employee ep = (Employee) o1;
            if (ep.getSal()>18000){
                System.out.println(o+"-"+o1);
            }
        }

        Iterator iterator1 = keySet.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            Object o = map.get(next);
            Employee ep  = (Employee) o ;
            if (ep.getSal()>18000){
                System.out.println(next+"-"+o);
            }

        }


    }
}

class Employee{
    private String name;
    private double sal;
    private int id;

    public Employee(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
