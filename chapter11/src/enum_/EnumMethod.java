package enum_;

/**
 * @author 王凯
 * @version 1.0
 */
public class EnumMethod {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        //Enum的name方法
        System.out.println(autumn.name());
        //ordinal 方法
        System.out.println(autumn.ordinal());//2
        //values方法 返回Season[] 数组
        Season2[] values = Season2.values();
        for (Season2 season : values){
            System.out.println(season);
        }
        int [] num = {1,3,5,7,9};
        for(int i :num){
            System.out.println(i);
        }
        //valueOf ：将字符串转换成枚举对象，首先字符串必须是已有的常量名，如果有就返回，如果没有就报错
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println(autumn1);
        System.out.println(autumn == autumn1);//true
        //compareTo 比较2个枚举对象的编号
        System.out.println(Season2.WINTER.compareTo(Season2.SPRING));//3-0 = 3
    }
}
