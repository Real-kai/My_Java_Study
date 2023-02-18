package abstract_;

/**
 * @author 王凯
 * @version 1.0
 */
public class AbstractExercise {
    public static void main(String[] args) {
       Manager jack =  new Manager("jack",11012,5000);
       jack.setBonus(20000);
       jack.work();
        new CommonEmployee("Tom",11015,3500).work();
            }
}
