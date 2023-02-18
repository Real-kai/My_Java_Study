package final_;

/**
 * @author 王凯
 * @version 1.0
 */
public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(AAA.num);
    }
}
class AAA{
    public static final int num ;
    static{
        num =10;
        System.out.println("AAA的静态代码块执行");
    }
}
