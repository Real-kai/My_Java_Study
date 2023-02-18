package final_;

/**
 * @author 王凯
 * @version 1.0
 */
public class FinalExercise01 {
    public static void main(String[] args) {
        System.out.println( new Circle(30).calArea());
    }
}
class Circle{
    private double radius;
    private final double PI = 3.14;


    public Circle(double radius) {
        this.radius = radius;
       // PI = 3.14;
    }

    public double calArea(){
        return PI*radius*radius;
    }

    //{PI = 3.14;}
}
