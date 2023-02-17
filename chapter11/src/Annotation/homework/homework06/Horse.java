package Annotation.homework.homework06;

/**
 * @author 王凯
 * @version 1.0
 */
public class Horse implements Vehicles{
    private static Horse horse;

    private Horse() {
    }

    @Override
    public void work() {
        System.out.println("一般情况下，用马作为交通工具");
    }

    public static Horse getInstance(){
        if (horse==null){
            horse = new Horse();
        }
        return horse;
    }
}
