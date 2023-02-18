package Arrays_;

import java.util.Comparator;

/**
 * @author 王凯
 * @version 1.0
 */
public class ArraySortCustom {
    public static void sort(Integer[] arr){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]<arr[j+1]){temp = arr[j];arr[j]=arr[j+1];arr[j+1]=temp;}
            }
        }
    }

    public static void sort2(Integer[] arr, Comparator<Integer> c){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (c.compare(arr[j],arr[j+1])>0){temp = arr[j];arr[j]=arr[j+1];arr[j+1]=temp;}

            }
        }
    }


}
