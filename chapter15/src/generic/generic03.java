package generic;

/**
 * @author 王凯
 * @version 1.0
 */
public class generic03 {
    public static void main(String[] args) {
        Person<String> p = new Person<>("王凯");

    }
}

class Person<E>{
    private E a;

    public Person(E a) {
        this.a = a;
    }

    public E m(E b){

        return b;
    }
}
