package generic.homework;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.*;

/**
 * @author 王凯
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        Dao<User> dao = new Dao<>();
        dao.save("01",new User("jack",01,18));
        dao.save("02",new User("tom",02,19));
        dao.save("03",new User("smith",03,28));
        dao.save("04",new User("rose",04,36));
        dao.save("05",new User("lay",05,17));
        System.out.println(dao);
        System.out.println("=================");

        System.out.println(dao.get("01"));
        System.out.println("=================");

        dao.upDate("03",new User("wangkai",03,25));
        System.out.println(dao);
        System.out.println("==================");

        List<User> list = dao.list();
        System.out.println(list);
        System.out.println("==================");

        dao.delete("03");
        System.out.println(dao);

    }
}
class Dao<T>{
    private Map<String,T> map = new HashMap<>();


    public void save(String id,T entity){
        map.put(id,entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void upDate(String id,T entity){
        map.put(id,entity);
    }

    public List<T> list(){
        List<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T t :values) {
            list.add(t);
        }

        return list;
    }

    public void delete(String id){
        map.remove(id);
    }

    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "map=" + map;
    }
}
class User{
    private String name;
    private int id;
    private int age;

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
