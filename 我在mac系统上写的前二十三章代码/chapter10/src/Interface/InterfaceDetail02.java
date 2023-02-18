package Interface;

/**
 * @author 王凯
 * @version 1.0
 */
public class InterfaceDetail02 {
    public static void main(String[] args) {
        System.out.println(IB.n1);//说明n1 是static的
        //IB.n1 = 20;//报错 说明n1是final的
    }
}


interface IC{
    void hi();
}
class Pig implements IB,IC{
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
