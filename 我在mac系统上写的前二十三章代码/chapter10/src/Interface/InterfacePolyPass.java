package Interface;

/**
 * @author 王凯
 * @version 1.0
 */
public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型的变量指向实现了该接口的类的实例对象
        IG ig = new I();
        //因为I实现了IG接口，然而IG继承了IH，就相当于I也实现了IH的接口
        IH ih = new I();
    }
}
interface IH{void hi();}
interface IG extends IH{}
class I implements IG{
    public void hi(){
        System.out.println("hi");
    }
}
