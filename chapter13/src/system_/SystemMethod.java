package system_;

import java.util.Arrays;

/**
 * @author 王凯
 * @version 1.0
 */
public class SystemMethod {
    public static void main(String[] args) {
//        System.out.println("a1");
//        System.exit(0);
//        System.out.println("a2");

        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[3];
        System.arraycopy(arr,0,arr2,0,3);
        System.out.println(Arrays.toString(arr2));
    }
}
