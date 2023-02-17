package draw.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @author 王凯
 * @version 1.0
 */
public class WkTankGame01 extends JFrame {
    private MyPanel mp =null;
    public static void main(String[] args) {
        new WkTankGame01();
    }

    public WkTankGame01() {
        mp = new MyPanel();
        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(1280,720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}

