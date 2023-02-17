package houserent;

import house.HouseApp;
import houserent.view.HouseView;

/**
 * @author 王凯
 * @version 1.0
 */
public class HouseRentApp {
    public static void main(String[] args) {
        new HouseView().mainMenu();
        System.out.println("退出房屋出租系统......");
    }
}
