package generic;

/**
 * @author 王凯
 * @version 1.0
 */
public class CustomGeneric {
    public static void main(String[] args) {
        Cat<String, Integer, Double> jack = new Cat<>("jack", 100, 200.0);
        jack.ra = new Integer[8];
    }
}

class Cat<T,R,E>{
    private T t;
    private R r;
    private E e;

    R [] ra;

   // public static m1(R {}

    public Cat(T t, R r, E e) {
        this.t = t;
        this.r = r;
        this.e = e;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
