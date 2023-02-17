package Interface;

/**
 * @author 王凯
 * @version 1.0
 */

public class InterfaceExercise02 {
    public static void main(String[] args) {
        new CCCC().Px();
    }
}
interface AAA{
    int n = 0;
}
class BBBB{
    int n = 1;
}
class CCCC extends BBBB implements AAA{
   public void Px(){
       System.out.println(super.n +" "+AAA.n);
   }
}
