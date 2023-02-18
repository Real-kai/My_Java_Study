package draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author 王凯
 * @version 1.0
 */
public class DrawCircle extends JFrame{
    private MyPanel mp = null;
    public static void main(String[] args) {
        DrawCircle drawCircle = new DrawCircle();
    }

    public MyPanel getMp() {
        return mp;
    }

    public void setMp(MyPanel mp) {
        this.mp = mp;
    }

    public DrawCircle(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(200,200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {
        System.out.println("paint方法被调用");
        super.paint(g);
       // g.drawOval(0,0,200,200);
        //  g.drawLine(100,100,200,200);
       // g.drawRect(100,100,500,500);
//        g.setColor(Color.GREEN);
//        g.fillRect(100,100,500,500);
//        g.setColor(Color.BLACK);
//        g.fillOval(100,100,200,100);
      Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/33.jpeg"));
      g.drawImage(image,10,10,610,610,this);
//
        g.setColor(Color.GREEN);
        g.fillOval(100,100,70,100);
        g.setColor(Color.WHITE);
        g.fillOval(125,80,20,20);
        g.setColor(Color.BLACK);
        g.drawLine(70,100,100,120);
        g.drawLine(70,200,100,180);
        g.drawLine(200,100,170,120);
        g.drawLine(170,180,200,200);
        g.setColor(Color.CYAN);
        g.fillOval(130,200,10,50);

    }
}
