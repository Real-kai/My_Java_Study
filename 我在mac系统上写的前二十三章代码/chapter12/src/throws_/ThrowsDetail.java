package throws_;

import java.io.FileNotFoundException;

/**
 * @author 王凯
 * @version 1.0
 */
public class ThrowsDetail {
    public static void main(String[] args) {

    }
}
class Father{
    public void method()throws RuntimeException{}
}

class son extends Father{
    @Override
    public void method() throws NullPointerException, ArithmeticException {
        super.method();
    }
}
