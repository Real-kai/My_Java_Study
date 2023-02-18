package tankgame3;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 王凯
 * @version 1.0
 */
public class WkTankGame02 extends JFrame {
    private MyPanel mp =null;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
         new WkTankGame02();
    }
        Scanner sc = new Scanner(System.in);
    public WkTankGame02() throws IOException, ClassNotFoundException {
        System.out.println("请输入您的选择: 1 开始新游戏  2 继续上局游戏");
        String key = sc.next();
        mp = new MyPanel(key);
        new Thread(mp).start();
        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(1280,720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    Recorder.save(mp.enemyVector,mp.myTank);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                System.exit(0);
            }
        });
    }
}

