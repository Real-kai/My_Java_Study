/**
 * @author 王凯
 * @version 1.0
 */
public class CpuNumber {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int i = runtime.availableProcessors();
        System.out.println(i);
    }
}
