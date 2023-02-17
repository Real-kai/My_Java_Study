package draw.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowStateListener;

/**
 * @author 王凯
 * @version 1.0
 */
public class BallMove extends JFrame {
    MyPanel mp ;
    public static void main(String[] args) {
        new BallMove();
    }
    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(900,700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
class MyPanel extends Panel implements KeyListener {
    int x  = 10;
    int y =10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,100,100);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            y+=10;
        } else if (e.getKeyCode()==KeyEvent.VK_UP) {
            y-=10;
        }else if (e.getKeyCode()==KeyEvent.VK_RIGHT){
            x+=10;
        }else if (e.getKeyCode()==KeyEvent.VK_LEFT){
            x-=10;
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
