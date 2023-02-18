package Interface;

/**
 * @author 王凯
 * @version 1.0
 */
public class InterfaceDetail01 {
    public static void main(String[] args) {
        //new IA();//报错，接口不能被实例化
    }
}
interface IA{
  void say();//public 和abstract可以省略
}
class BB implements IA{
   public void say(){};//子类重写的方法访问权限必须大于等于父类的方法
}
abstract class CC implements IA{}