package class_;

import reflection.question.Cat;

/**
 * @author 王凯
 * @version 1.0
 */
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Cat cat = new Cat();
        Class<?> cls = Class.forName("reflection.question.Cat");
    }
}
