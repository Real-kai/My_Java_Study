package Annotation;

import java.util.ArrayList;

/**
 * @author 王凯
 * @version 1.0
 */
@SuppressWarnings({"rawtypes","unchecked","unused"})
public class SuppressWarnings_ {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Tom");
        list.add("jack");
        list.add("rose");
        int i;
        System.out.println(list.get(1));
    }
    public static void f1(){
        ArrayList list = new ArrayList();
        list.add("Tom");
        list.add("jack");
        list.add("rose");
        int i;
        System.out.println(list.get(1));
    }
}
