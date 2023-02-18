package polymorphic;

import polymorphic.objpoly.Rice;

/**
 * @author 王凯
 * @version 1.0
 */
public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("汤姆");
        Animal dog = new Dog("小白");
        Food bone = new Bone("骨头");

        tom.feed(dog,bone);

        System.out.println("==================");
        Animal cat = new Cat("杰姆");
        Food fish = new Fish("黄花鱼");
        tom.feed(cat,fish);

        System.out.println("=================");
        Animal pig = new Pig("小猪");
        Food rice = new Rice("米饭");
        tom.feed(pig,rice);

    }
}
