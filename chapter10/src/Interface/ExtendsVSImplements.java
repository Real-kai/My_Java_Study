package Interface;

/**
 * @author 王凯
 * @version 1.0
 */
public class ExtendsVSImplements {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("kakarotto");
        wukong.climb();
        wukong.fly();
        wukong.swimming();
    }
}
class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climb(){
        System.out.println(name+"会爬树");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
interface Bird{
    void fly();
}
interface Fish {
    void swimming();
}
class LittleMonkey extends Monkey implements Bird,Fish{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName()+"通过学习，可以像小鸟一样飞翔");
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"通过学习，可以向鱼儿一样游泳");
    }
}
