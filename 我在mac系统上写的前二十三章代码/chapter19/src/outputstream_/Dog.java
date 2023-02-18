package outputstream_;

import java.io.Serializable;

/**
 * @author 王凯
 * @version 1.0
 */
public class Dog implements Serializable {
    private String name;
    private int old;

    public Dog(String name, int old) {
        this.name = name;
        this.old = old;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", old=" + old +
                '}';
    }
}
