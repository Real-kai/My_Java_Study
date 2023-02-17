package houserent.service;

import house.HouseInfo;
import houserent.domain.House;
import houserent.utils.Utility;

import java.util.Scanner;

/**
 * @author 王凯
 * @version 1.0
 */
public class HouseService {
    private House[] arr;
    private int houseNum=1;
    private int idCounter=1;

    public HouseService(int size) {
      arr = new House[size];
      arr[0] = new House(1,"王凯","18657377131","南湖区",2000,"未出租");
    }

    Scanner sc = new Scanner(System.in);
    public boolean add(House newHouse){
                    if (houseNum==arr.length){
                        System.out.println("数组已满，正在扩容...");
                        House[] arrNew = new House[arr.length+5];
                        for (int i = 0; i < arr.length; i++) {
                            arrNew[i] = arr[i];
                        }
                        arr = arrNew;
                    }
                    arr[houseNum++] = newHouse;
                    newHouse.setNum(++idCounter);
                    return true;
                }


    public boolean remove(int num){
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (num == arr[i].getNum()){index = i;}
        }
        if (index == -1){
            System.out.println("找不到要删除的数组");return false;
        }
        for (int i = index; i < houseNum-1 ; i++) {
            arr[i] = arr[i+1];arr[i].setNum(arr[i+1].getNum()-1);
        }
        arr[--houseNum] = null;
        return true;


    }

    public House findById(int num) {
        for (int i = 0; i < houseNum; i++) {
            if (num == arr[i].getNum()){return arr[i];}
        }

        return null;

    }

    public House[] List(){
       return arr;
    }


}
