package object_.equalsExercise;

/**
 * @author 王凯
 * @version 1.0
 */
public class EqualsExercise01 {
    public static void main(String[] args) {
        Person p1 = new Person("王凯",25,'x');
        Person p2 = new Person("张三",25,'x');
        Person p3 = new Person("王凯",25,'x');
        Person p4 = new Student("张三",25,'x');
        System.out.println(p1.equals(p2));//false
        System.out.println(p1.equals(p3));//true
        System.out.println(p2.equals(p4));//true

        char a = 65;
        char b = 'A';
        int c = 65;
        System.out.println(a);
        System.out.println(a == b);//true
        System.out.println(a == c);//true

    }
}
