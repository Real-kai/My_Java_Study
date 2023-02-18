package abstract_;

/**
 * @author 王凯
 * @version 1.0
 */
public class AA extends CC{
    public AA(String name) {
        super(name);
    }

    public void job(){
            int num = 0;
            for (int i = 1; i <= 800000; i++) {
                num*=i;
            }
        }
}
