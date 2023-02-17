package InnerClass;

/**
 * @author 王凯
 * @version 1.0
 */
public class InnerclassExercise01 {
    public static void main(String[] args) {
        show(new AA() {
            @Override
            public void cry() {
                System.out.println("狗在哭...");
            }
        });
    }
    public static void show(AA aa){
        aa.cry();
    }
}
interface AA{
    void cry();
}
