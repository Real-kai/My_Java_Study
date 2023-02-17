package house;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 王凯
 * @version 1.0
 */
public class HouseApp {
    public static void main(String[] args) {
        HouseSys hs = new HouseSys();
        hs.HouseMenu();
       // saveInput();
    }

    public static void saveInput(){
        Scanner sc = new Scanner(System.in);
//读取直到没有新的输⼊
        ArrayList<Integer> save = new ArrayList<>();
        while(true){
//       输⼊两次enter结束
            String s = sc.nextLine();
            if ("".equals(s)) break;
            Scanner s2 = new Scanner(s);
            while(s2.hasNextInt()) save.add(s2.nextInt());
        }
        System.out.println(save.toString());}
}
