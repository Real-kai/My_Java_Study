package houserent.view;

import houserent.domain.House;
import houserent.service.HouseService;
import houserent.utils.Utility;

import java.util.Scanner;

/**
 * @author 王凯
 * @version 1.0
 */
public class HouseView {
    private boolean loop = true;
    private char key = ' ';

    private HouseService houseService = new HouseService(2);

    public void mainMenu(){
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("------------------房屋出租系统------------------");
            System.out.println("\t\t\t\t"+"1 新 增 房 源");
            System.out.println("\t\t\t\t"+"2 查 找 房 屋");
            System.out.println("\t\t\t\t"+"3 删 除 房 屋");
            System.out.println("\t\t\t\t"+"4 修 改 房 屋 信 息");
            System.out.println("\t\t\t\t"+"5 房 屋 列 表");
            System.out.println("\t\t\t\t"+"6 退      出");
            System.out.println("请选择(1-6): ");
            key = Utility.readChar();
            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                   findHouse();break;
                case '3':
                    removeHouse();break;
                case '4':
                    alterHouse();break;
                case '5':
                    houseList();break;
                case '6':
                    exit();break;
            }

        }
        while(loop);
    }
    public void addHouse (){
        System.out.println("------------------添加房屋------------------");

        System.out.print("姓名: ");String name = Utility.readString(5);
        System.out.print("电话: ");String pohoneNum = Utility.readString(12);
        System.out.print("地址: ");String address = Utility.readString(20);
        System.out.print("月租: ");int rent= Utility.readInt();
        System.out.print("状态(未出租/已出租): ");String state = Utility.readString(4,"未出租");
        House newHouse = new House(0,name,pohoneNum,address,rent,state);
        if (houseService.add(newHouse)){
            System.out.println("------------------添加成功------------------");
        }else{
            System.out.println("------------------添加失败------------------");
        }
        System.out.println("------------------添加完成------------------");
    }

    public void findHouse(){
        System.out.println("------------------查找房屋------------------");
        System.out.print("请输入你要查找的ID:");
        int i = Utility.readInt();
        House house = houseService.findById(i);
        if (house == null){
            System.out.println("没有查找到该房屋");}
        else {
        System.out.println(house);}
    }

    public void removeHouse(){
        System.out.println("------------------删除房屋------------------");
        System.out.print("请选择待删除房屋编号(-1退出):");

        int num = Utility.readInt();
        if (num==-1){
            System.out.println("正在退出...");return;}
        System.out.println("确认是否删除(Y/N): 请小心选择:");
        char c = Utility.readConfirmSelection();
        if (c=='Y'){if (houseService.remove(num)){
            System.out.println("------------------删除成功------------------");
        }else {
            System.out.println("------------------删除失败------------------");}}
        System.out.println("------------------删除完成------------------");
    }

    public void alterHouse(){
        System.out.println("------------------修改房屋------------------");
        System.out.println("请选择待修改房屋编号(-1退出):");
        int num = Utility.readInt();
        if (num == -1){
            System.out.println("正在退出...");
            return;
        }
        House arr = houseService.findById(num);
        if (arr==null){
            System.out.println("\"------------------你要修改的房屋信息不存在------------------\"");return;}
        System.out.print("姓名"+"("+arr.getName()+"):");
        String s = Utility.readString(5, "跳过");
        if (!s.equals("跳过"))
        {arr.setName(s);}
        System.out.print("电话"+"("+arr.getPhoneNum()+"):");
        String  s2 = Utility.readString(12,"");
        if (!s2.equals(""))
        {arr.setPhoneNum(s2);}
        System.out.print("地址"+"("+arr.getAddress()+"):");
        String s3 = Utility.readString(20, "跳过");
        if (!s3.equals("跳过"))
        {arr.setAddress(s3);}
        System.out.print("租金"+"("+arr.getMonthlyRent()+"):");
        int s4 = Utility.readInt(-1);
        if (s4!=-1)
        {arr.setMonthlyRent(s4);}
        System.out.print("状态"+"("+arr.getState()+"):");
        String s5 = Utility.readString(4, "跳过");
        if (!s5.equals("跳过"))
        {arr.setState(s5);}

        System.out.println("------------------修改完成------------------");
    }

    public void houseList(){
        House[] arr = houseService.List();
        System.out.println("------------------房屋列表------------------");
        System.out.println("编号\t\t"+"姓名\t\t\t" + "电话号码\t\t\t" + "地址\t\t\t"  + "月租\t\t\t" + "状态(未出租/已出租)" );
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==null){break;}
                System.out.println(arr[i]);
        }
        System.out.println("------------------房屋列表完成------------------");
    }

    public void exit(){
        System.out.println("您确定要退出房屋信息系统吗?(Y/N)");
        char c = Utility.readConfirmSelection();
        if (c=='Y') {
            System.out.println("您退出了房屋出租系统");loop = false;
        }
    }
}
