package list;

import java.util.*;

/**
 * @author 王凯
 * @version 1.0
 */
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("三国演义","罗贯中",78));
        list.add(new Book("红楼梦","曹雪芹",99));
        list.add(new Book("西游记","吴承恩",10));

        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-1-i; j++) {
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j+1);
                if (book1.getPrice()>book2.getPrice()){
                   list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

    }
}
class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("书名:\t《%s》\t\t作者:\t%s\t\t价格:\t%.2f",name,author,price);
    }
}
