package Annotation.homework;

/**
 * @author 王凯
 * @version 1.0
 */
public class Homework08 {
    public static void main (String[] args) {
        Color red = Color.BLACK;
        red.show();
        switch (red){
            case BLUE -> System.out.println("匹配到蓝色");
            case GREEN -> System.out.println("匹配到绿色");
            case RED -> System.out.println("匹配到红色");
            default -> System.out.println("没有匹配到颜色");
        }
    }
}
interface Show{
    void show();
}
enum Color implements Show{
    RED(255,0,0),BLUE(0,0,255),
    BLACK(0,0,0),YELLOW(255,255,0),
    GREEN(0,255,0)
    ;
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public String toString() {
        return
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue
              ;
    }

    @Override
    public void show() {
        System.out.println(redValue+" "+greenValue+" "+blueValue);
    }
}
