package set_;

import java.util.HashSet;

/**
 * @author 王凯
 * @version 1.0
 */
public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
//        for (int i = 1; i <= 100 ; i++) {
//            hashSet.add(i);
//        }
//    }
        for (int i = 1; i <= 12; i++) {
            hashSet.add(new A(i));
        }
    }
}

class A{
    int n ;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
