package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author 王凯
 * @version 1.0
 */
public class Collections_ {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("jr");
        arrayList.add("smith");
        arrayList.add("tom");
        arrayList.add("rose");
        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println("=====反转后的效果=====");
        System.out.println(arrayList);

        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        Collections.sort(arrayList);//按照字符串大小排序 默认调用compareTo方法
        System.out.println(arrayList);

        Collections.sort(arrayList, new Comparator<Object>(){
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o2).length()-((String)o1).length();//按字符串长度从大到小排序
            }
        });
        System.out.println(arrayList);

        Comparable max = Collections.max(arrayList);
        System.out.println(max);

        Object max1 = Collections.max(arrayList, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println(max1);

        System.out.println(Collections.min(arrayList));

        Object min1 = Collections.min(arrayList, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println(min1);

        System.out.println(Collections.frequency(arrayList,"smith"));

        ArrayList test = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            test.add(i);
        }
        Collections.copy(test,arrayList);
        System.out.println(test);

        Collections.replaceAll(arrayList,"jr","tom");
        System.out.println(arrayList);
    }
}
