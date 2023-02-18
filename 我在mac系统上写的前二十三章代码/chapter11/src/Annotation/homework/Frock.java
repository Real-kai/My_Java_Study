package Annotation.homework;

/**
 * @author 王凯
 * @version 1.0
 */
public class Frock {
    private static int currentNum=100000;
    private int serialNumber;

    public Frock() {
        serialNumber = getNextNum();
    }

    public static int getNextNum (){
      return  currentNum+=100;

    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
