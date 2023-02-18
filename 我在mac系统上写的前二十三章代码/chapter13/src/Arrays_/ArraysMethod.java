package Arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 王凯
 * @version 1.0
 */
public class ArraysMethod {
    public static void main(String[] args) {
        //1 to String
        Integer[] integers = {1,90,34,40};
        System.out.println(Arrays.toString(integers));

        //2.sort
        Integer[] arr = {100,89,12,1,56,78,99};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (Integer)o2-(Integer) o1;
            }
        });
        System.out.println(Arrays.toString(arr));

        Integer[] arr2 = {59,29,100,22,1,844,300,12,66};
        ArraySortCustom.sort2(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr2));
    }
}
