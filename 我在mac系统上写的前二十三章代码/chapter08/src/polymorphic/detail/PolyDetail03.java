package polymorphic.detail;

/**
 * @author 王凯
 * @version 1.0
 */
public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof  BB);//true
        System.out.println(bb instanceof AA);//true
        //看对象的运行类型是否为xx类型或xx类型的子类类型
        AA aa = new BB();
        System.out.println(aa instanceof AA);//true
        System.out.println(aa instanceof BB);//true

        Object obj = new Object();
        System.out.println(obj instanceof  AA);//false
        String str = "hello";
        //System.out.println(str instanceof AA);// 直接报错 因为str和AA没有继承关系
        System.out.println(str instanceof Object);//true
    }
}
class AA{}
class BB extends AA{}
