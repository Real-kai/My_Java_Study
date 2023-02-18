package debug;

import java.util.Arrays;

/**
 * @author 王凯
 * @version 1.0
 */
public class Debug03 {
    public static void main(String[] args) {
        int [] arr = {230,90,120,520,6,9};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
