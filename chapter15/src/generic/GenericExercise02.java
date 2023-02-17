package generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author 王凯
 * @version 1.0
 */
public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee jack = new Employee("jack", 5600, new MyDate(1997, 11, 30));
        Employee tom = new Employee("jack", 12000, new MyDate(1997, 11, 20));
        Employee smith = new Employee("smith", 34000, new MyDate(1990, 1, 12));
        list.add(jack);
        list.add(tom);
        list.add(smith);
        for (Employee employee :list  ) {
            System.out.println(employee);
        }
        System.out.println("===================");

        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName()==o2.getName()) {
                    MyDate birthday1 = o1.getBirthday();
                    MyDate birthday2 = o2.getBirthday();
                  return birthday1.compareTo(birthday2);
                }
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Employee employee :list  ) {
            System.out.println(employee);
        }

    }
}
class Employee{
    private  String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    @Override
    public int compareTo(MyDate o) {
        if (year!= o.getYear()){
            return year-o.getYear();
        }else if (month!=o.getMonth()){
            return month-o.getMonth();
        }else if (day!=o.getDay()){
            return day-o.getDay();
        }else{return 0;}
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year +
                "-" + month +
                "-" + day;
    }
}
