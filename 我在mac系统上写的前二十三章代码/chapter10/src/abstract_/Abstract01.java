package abstract_;

/**
 * @author 王凯
 * @version 1.0
 */
public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class  Animal{
    private String name;

     public Animal(String name) {
         this.name = name;
     }

     public abstract void eat();
 }