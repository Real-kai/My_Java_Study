package generic;

import java.util.ArrayList;

/**
 * @author 王凯
 * @version 1.0
 */
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car.k("bmw",300000.0);//静态方法也可以是泛型方法

        Car car = new Car();
        car.run("奔驰",418000.00);
        System.out.println("============");
        car.run(true,100.0f);
        System.out.println("===========");
        Plane<String, ArrayList> pl = new Plane<>();
        pl.fly("波音747",200000000.00,new ArrayList());

    }
}
class Plane<R,T>{
    public<U,I> void fly(U u,I i,T t){
        System.out.println(u.getClass().getSimpleName());
        System.out.println(i.getClass());
        System.out.println(t.getClass());
    }


}
class Car{
    public static <H,J> void k(H h,J j){

    }
    public<R,T> void run(R r,T t){
        System.out.println(r.getClass());
        System.out.println(t.getClass());
    }
}
