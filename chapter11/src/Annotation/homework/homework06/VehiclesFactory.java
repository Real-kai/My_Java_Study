package Annotation.homework.homework06;

/**
 * @author 王凯
 * @version 1.0
 */
public class VehiclesFactory {
    public static Horse getHorse(){
        return Horse.getInstance();
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Vehicles getPlane(){
        return new Plane();
       /* Vehicles  plane= new Vehicles(){
            @Override
            public void work() {
                System.out.println("过火焰山乘飞机...");
            }
        };
        return plane;*/
    }
}
