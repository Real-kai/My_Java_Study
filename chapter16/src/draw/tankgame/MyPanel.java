package draw.tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 王凯
 * @version 1.0
 */
public class MyPanel extends JPanel implements KeyListener {

        private MyTank myTank;
        private Enemy enemy;

        private Vector<Enemy> enemyVector = new Vector<>();
        private int enemySize = 3;

        public MyPanel(){
            myTank = new MyTank(10,640);
            for (int i = 0; i < enemySize; i++) {
                enemyVector.add(new Enemy(100*(i+1),0));
            }



        }
        @Override
        public void paint(Graphics g) {
            System.out.println("paint方法被调用");
            super.paint(g);
            g.fillRect(0,0,1280,720);


            drawTank(myTank.getX(),myTank.getY(),g,0,myTank.getDirection() );
            for (Enemy o:enemyVector
                 ) {
                o.setDirection(1);
                drawTank(o.getX(),o.getY(),g,1,o.getDirection());
            }
            if (Boom.a=true){
            Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/boom.jpg"));
            g.drawImage(image,100,100,this);}



           // drawTank(tank.getX()+60,tank.getY(),g,0,0);
        }

        public void drawTank(int x,int y,Graphics g,int who,int direction){
            switch(who){
            case 0:
                g.setColor(Color.CYAN);
                break;
                case 1:
                    g.setColor(Color.YELLOW);
                    break;

            }

            switch(direction){
                case 0: g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y,x+20,y+30);
                break;
                case 1:
                    g.fill3DRect(x,y,10,60,false);
                    g.fill3DRect(x+10,y+10,20,40,false);
                    g.fill3DRect(x+30,y,10,60,false);
                    g.fillOval(x+10,y+20,20,20);
                    g.drawLine(x+20,y+30,x+20,y+60);
                    break;
                case 2:
                    g.fill3DRect(x,y,60,10,false);
                    g.fill3DRect(x+10,y+10,40,20,false);
                    g.fill3DRect(x,y+30,60,10,false);
                    g.fillOval(x+20,y+10,20,20);
                    g.drawLine(x,y+20,x+30,y+20);
                    break;
                case 3:
                    g.fill3DRect(x,y,60,10,false);
                    g.fill3DRect(x+10,y+10,40,20,false);
                    g.fill3DRect(x,y+30,60,10,false);
                    g.fillOval(x+20,y+10,20,20);
                    g.drawLine(x+30,y+20,x+60,y+20);
                    break;
                default:
                    System.out.println("无其他操作");


            }
        }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
           myTank.setDirection(1);myTank.moveDown();
        } else if (e.getKeyCode()==KeyEvent.VK_UP) {
            myTank.setDirection(0);myTank.moveUp();
        }else if (e.getKeyCode()==KeyEvent.VK_RIGHT){
            myTank.setDirection(3);myTank.moveRight();
        }else if (e.getKeyCode()==KeyEvent.VK_LEFT){
            myTank.setDirection(2);myTank.moveLeft();
        }else if (e.getKeyCode()==KeyEvent.VK_J){

        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

