package codeblock;

/**
 * @author 王凯
 * @version 1.0
 */
public class CodeBlock {
    public static void main(String[] args) {
        new Movie("张三");
        System.out.println("=================");
        new Movie("肖申克的救赎",100,"TELEX");

    }
}
class Movie{
    private String name;
    private double price;
    private  String director;

   static {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始了...");
        System.out.println("电影正式开始...");
    }
    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
