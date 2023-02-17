package generic;

/**
 * @author 王凯
 * @version 1.0
 */
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

class CC implements IA{
    @Override
    public Object m1(Object o) {
        return null;
    }

    @Override
    public Object m2() {
        return null;
    }

    @Override
    public Object m3(Object a, Object b, Object c, Object d) {
        return IA.super.m3(a, b, c, d);
    }
}
class BB implements IA<Integer,Double>{
    @Override
    public Integer m1(Double aDouble) {
        return null;
    }

    @Override
    public Double m2() {
        return null;
    }

    @Override
    public Integer m3(Integer a, Integer b, Double c, Double d) {
        return IA.super.m3(a, b, c, d);
    }
}
class AA implements IB{
    @Override
    public String m1(Integer integer) {
        return null;
    }

    @Override
    public Integer m2() {
        return null;
    }

    @Override
    public String m3(String a, String b, Integer c, Integer d) {
        return IB.super.m3(a, b, c, d);
    }
}
interface IB extends IA<String,Integer>{

}
 interface IA<R,U>{
    int a = 10;//等价于public static final int a = 10;所以接口中的属性无法使用泛型
     R m1(U u);
     U m2();
     default R m3(R a,R b,U c,U d){
         return null;
     }
 }
