package Arrays_;

import java.util.Arrays;
import java.util.List;

/**
 * @author 王凯
 * @version 1.0
 */
public class ArrayMethod02 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int i = Arrays.binarySearch(arr, 3);
        System.out.println(i);

        int[] arr2 = Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(arr2));

        Arrays.fill(arr,99);
        System.out.println(Arrays.toString(arr));

        boolean equals = Arrays.equals(arr, arr2);
        System.out.println(equals);//false

      //  List<Integer> list = Arrays.asList(arr);
       // System.out.println(list.getClass());

    }
}
