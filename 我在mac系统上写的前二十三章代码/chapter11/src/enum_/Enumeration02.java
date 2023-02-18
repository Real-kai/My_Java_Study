package enum_;

/**
 * @author 王凯
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.SUMMER);
        System.out.println(Season.WINTER);
    }
}
class Season{
    private String name;
    private String dsc;


    //类似于单例模式 饿汉式
    //添加final 此时类还是被加载了，因为创建了对象
    //去掉set方法 防止被修改，只读
    public static final Season SPRING = new Season("春天","温暖");
    public static final Season SUMMER = new Season("夏天","炎热");
    public static final Season AUTUMN = new Season("秋天","凉爽");
    public static final Season WINTER = new Season("冬天","寒冷");

    private Season(String name,String dsc) {
        this.name = name;
        this.dsc= dsc;
    }

    public String getName() {
        return name;
    }



    public String getDsc() {
        return dsc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", dsc='" + dsc + '\'' +
                '}';
    }
}

