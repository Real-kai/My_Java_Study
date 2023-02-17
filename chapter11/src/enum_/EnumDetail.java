package enum_;

/**
 * @author 王凯
 * @version 1.0
 */
public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASSICMUSIC.fly();
    }
}
class A{}
//enum season3 extends A{}

interface Fly{
    void fly();
}
enum Music implements Fly{
    CLASSICMUSIC;

    @Override
    public void fly() {
        System.out.println("Music会飞");
    }
}
