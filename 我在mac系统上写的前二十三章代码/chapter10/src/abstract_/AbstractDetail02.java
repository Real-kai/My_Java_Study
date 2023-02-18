package abstract_;

/**
 * @author 王凯
 * @version 1.0
 */
public class AbstractDetail02 {
    public static void main(String[] args) {

    }
}
abstract class D{
    public abstract  void say();
}
abstract class E extends D{

}
class F extends D{
    @Override
    public void say() {

    }//只要有方法体就行 方法体里面可以没有内容
}

