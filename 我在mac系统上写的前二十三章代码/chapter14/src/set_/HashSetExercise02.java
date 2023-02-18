package set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 王凯
 * @version 1.0
 */
public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee02("王凯",12000,new MyDate(1996,9,30)));
        hashSet.add(new Employee02("张三",32000,new MyDate(1999,8,10)));
        hashSet.add(new Employee02("王凯",22000,new MyDate(1996,9,30)));
        System.out.println(hashSet);

    }
}
class Employee02{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee02(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee02 that = (Employee02) o;
        return Objects.equals(name, that.name) && Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "Employee02{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
 class MyDate{
    private int year;
    private int month;
    private int day;

     public MyDate(int year, int month, int day) {
         this.year = year;
         this.month = month;
         this.day = day;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         MyDate myDate = (MyDate) o;
         return year == myDate.year && month == myDate.month && day == myDate.day;
     }

     @Override
     public int hashCode() {
         return Objects.hash(year, month, day);
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
         return  String.format("%d年%d月%d日",year,month,day);
     }
 }
