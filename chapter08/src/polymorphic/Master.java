package polymorphic;

/**
 * @author 王凯
 * @version 1.0
 */
public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public void feed(Animal animal,Food food){
        System.out.println("主人 "+name+"给"+animal.getName()+"喂"+food.getName());
    }

    //狗吃骨头
//    public void feed(Dog dog,Bone bone){
//        System.out.println("主人 "+name+"给"+dog.getName()+"喂"+bone.getName());
//    }
    //如果以后动物很多，食物也很多，feed方法也会很多，不利于代码的管理与维护 引出多态：提高代码复用性

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
