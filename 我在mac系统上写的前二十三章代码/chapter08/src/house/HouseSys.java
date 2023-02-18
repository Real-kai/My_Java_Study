package house;

import houserent.utils.Utility;
import jdk.jshell.execution.Util;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 王凯
 * @version 1.0
 */
public class HouseSys {
    Scanner sc = new Scanner(System.in);
    HouseInfo[] arr = new HouseInfo[6];
    public void HouseMenu(){
        boolean loop = true;
        do {
        System.out.println("------------------房屋出租系统------------------");
        System.out.println("\t\t\t\t"+"1 新 增 房 源");
        System.out.println("\t\t\t\t"+"2 查 找 房 屋");
        System.out.println("\t\t\t\t"+"3 删 除 房 屋");
        System.out.println("\t\t\t\t"+"4 修 改 房 屋 信 息");
        System.out.println("\t\t\t\t"+"5 房 屋 列 表");
        System.out.println("\t\t\t\t"+"6 退      出");
        System.out.println("请选择(1-6): ");
        int key = sc.nextInt();
        switch (key){
            case 1:addHouse();break;
            case 2:findHouse();break;
            case 3:removeHouse();break;
            case 4:alterHouse();break;
            case 5:houseList();break;
            case 6:exit();loop = false;break;
        }

        }
        while(loop);
    }

    public void addHouse(){

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = new HouseInfo();
            if (i==arr.length-1){
                HouseInfo [] arrNew = new HouseInfo[arr.length+1];
                for (int j = 0; j < arr.length; j++) {
                    arrNew[j] = arr[j];
                }
                arr = arrNew;
            }
            System.out.println("------------------添加房屋------------------");
            System.out.println("姓名: ");arr[i].setName(sc.next());
            System.out.println("电话: ");arr[i].setPhoneNum(sc.nextInt());
            System.out.println("地址: ");arr[i].setAddress(sc.next());
            System.out.println("月租: ");arr[i].setMonthlyRent(sc.nextDouble());
            System.out.println("状态(未出租/已出租): ");arr[i].setState(sc.next());

            System.out.println("------------------添加完成------------------");
            System.out.println("是否继续添加? Y/N");
            char c = Utility.readConfirmSelection();
            if (c=='N'){break;}

        }}

    public void findHouse(){
        while(true){
        System.out.println("------------------查找房屋------------------");
        System.out.println("请输入你要查找的ID:");
        int num = sc.nextInt();
        if (num>arr.length){
            System.out.println("------------------没有该房屋------------------");
        }
        System.out.println(num+"\t"+arr[num-1]);
        System.out.println("请问是否继续查找? Y/N");
        String s = sc.next();
            char c = Utility.readConfirmSelection();
            if (c=='N') break;}
    }

    public void removeHouse(){
      while(true){  System.out.println("------------------删除房屋------------------");
        System.out.println("请选择待删除房屋编号(-1退出):");

        int num;
        while(true){
        num = sc.nextInt();
        if (num<-1||num==0||num>arr.length){
            System.out.println("请输入正确的编号:");
        } else {break;}
        }
        if (num==-1){
            System.out.println("正在退出...");break;}
        System.out.println("确认是否删除(Y/N): 请小心选择:");
          char c = Utility.readConfirmSelection();
          if (c=='Y'){
        HouseInfo[] arrNew = new HouseInfo[arr.length-1];
        for (int i = 0,j=0; i < arrNew.length; i++,j++) {
           if (i==num-1){arrNew[i] = arr[num];j++;}
           else { arrNew[i] =arr[j];}
        }
        arr = arrNew;
            System.out.println("------------------删除完成------------------");}
        System.out.println("是否继续删除?(Y/N)");
          char c1 = Utility.readConfirmSelection();
          if (c1=='N') System.out.println("正在退出...");break;}
    }

    public void alterHouse() {
        while (true) {
            System.out.println("------------------修改房屋------------------");
            System.out.println("请选择待修改房屋编号(-1退出):");
            int num;
            while (true) {
                num = sc.nextInt();
                if (num < -1 || num == 0 || num > arr.length) {
                    System.out.println("请输入正确的编号:");
                } else {
                    break;
                }
            }
            if (num == -1){
                System.out.println("正在退出...");
            break;
        }
            System.out.println("姓名"+"("+arr[num-1].getName()+")");
            String s = Utility.readString(10, "跳过");
            if (s!="")
            {arr[num-1].setName(s);}
            System.out.println("电话"+"("+arr[num-1].getPhoneNum()+")");
            String s2 = Utility.readString(10, "跳过");
            if (s2!="")
            {arr[num-1].setName(s2);}
            System.out.println("地址"+"("+arr[num-1].getAddress()+")");
            String s3 = Utility.readString(10, "跳过");
            if (s3!="")
            {arr[num-1].setName(s3);}
            System.out.println("租金"+"("+arr[num-1].getMonthlyRent()+")");
            String s4 = Utility.readString(10, "跳过");
            if (s4!="")
            {arr[num-1].setName(s4);}
            System.out.println("状态"+"("+arr[num-1].getState()+")");
            String s5 = Utility.readString(10, "跳过");
            if (s5!="")
            {arr[num-1].setName(s5);}
            System.out.println("------------------修改完成------------------");
            System.out.println("是否继续修改? (Y/N)");
            char c = Utility.readConfirmSelection();
            if (c=='N') break;
        }
    }
//          "状态:" + state;
    public void houseList(){
        System.out.println("------------------房屋列表------------------");
        System.out.println("编号\t"+"姓名\t" + "电话号码\t" + "地址\t"  + "月租\t" + "状态(未出租/已出租)" );
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
            int num = i+1;
            System.out.println(num+"\t"+arr[i]);}
        }
        System.out.println("------------------房屋列表完成------------------");
    }

    public void exit(){
        System.out.println("正在退出...");
    }
}
