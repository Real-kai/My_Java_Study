package Arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 王凯
 * @version 1.0
 */
public class ArraysExercise {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("西游记111",99.9);
        books[1] = new Book("水浒传",12);
        books[2] = new Book("红楼梦22",33);
        books[3] = new Book("三国演义",55);
        books[4] = new Book("金瓶梅",99.8);
        Book temp;
        for (int i = 0; i < books.length-1; i++) {
            for (int j = 0; j < books.length-1-i; j++) {
                if (books[j].getPrice()<books[j+1].getPrice()){
                    temp = books[j];books [j] = books[j+1];books[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(books));

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double i = o1.getPrice()-o2.getPrice();
                if (i>0){return 1;}
                return -1;
            }
        });
        System.out.println(Arrays.toString(books));

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double i = o2.getPrice()-o1.getPrice();
                if (i>0){return 1;}
                return -1;
            }
        });
        System.out.println(Arrays.toString(books));

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
              return o2.getName().length()-(int)o1.getName().length();

            }
        });
        System.out.println(Arrays.toString(books));
    }
}
