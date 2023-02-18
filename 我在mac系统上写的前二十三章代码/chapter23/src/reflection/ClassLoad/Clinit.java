package reflection.ClassLoad;

/**
 * @author 王凯
 * @version 1.0
 */
public class Clinit {
    static{
        System.out.println("静态代码块执行了......");
    }
    public static int n = 10;
}
