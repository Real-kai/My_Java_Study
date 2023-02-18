package final_;

/**
 * @author 王凯
 * @version 1.0
 */
public class Final01 {
    public static void main(String[] args) {
      //  new E().Tax_rate = 0.09;  报错
    }
}
final class A{
}
//class B extends A{}   报错！
class C{
    final public void hi(){}
}
class D extends C{

    public void cry(){
        final int Num = 10;
       // Num = 11; 错误
    }
//    public void hi() {
//        super.hi();
//    }   报错！
}
class E{
    public final double Tax_rate = 0.08;
}