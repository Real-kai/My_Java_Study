package tankgame3;

import java.util.Random;
import java.util.Vector;

/**
 * @author 王凯
 * @version 1.0
 */
public class Enemy extends Tank implements Runnable{

    public Enemy(int x, int y, double blood) {
        super(x, y, blood);
    }

    public void shotHeroTank() {
        if (shotVector.size()==5){return;}
        switch (getDirection()) {
            case 0:
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1:
                shot = new Shot(getX() + 20, getY() + 60, 1);
                break;
            case 2:
                shot = new Shot(getX(), getY() + 20, 2);
                break;
            case 3:
                shot = new Shot(getX() + 60, getY() + 20, 3);
                break;
        }
        shotVector.add(shot);
        new Thread(shot).start();
    }


    @Override
    public void run() {
        while(true){
            if(!isLive){break;}
            shotHeroTank();
       switch(getDirection()){
           case 0:
               for (int i = 0; i < 20; i++) {
                   if (i==15){shotHeroTank();}
                   if (getY()>0&&!isTouch()&&!isTouchRiver()&&!isTouchIron()&&!isTouchBrick()){
                   moveUp();}else {break;}
                   try {
                       Thread.sleep(200);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }

           break;

           case 1:
               for (int i = 0; i < 25; i++) {
                   if (i==15){shotHeroTank();}
                   if (getY()<660&&!isTouch()&&!isTouchRiver()&&!isTouchIron()&&!isTouchBrick()){
                   moveDown();} else {break;}
                   try {
                       Thread.sleep(200);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
               break;

           case 2:
                   for (int i = 0; i <25; i++) {
                       if (i==15){shotHeroTank();}
                       if (getX()>0&&!isTouch()&&!isTouchRiver()&&!isTouchIron()&&!isTouchBrick()) { moveLeft();}else {break;}
                       try {
                           Thread.sleep(200);
                       } catch (InterruptedException e) {
                           throw new RuntimeException(e);
                       }
                   }
                  break;

           case 3:
               for (int i = 0; i <25; i++) {
                   if (i==15){shotHeroTank();}
                   if (getX()<1020&&!isTouch()&&!isTouchRiver()&&!isTouchIron()&&!isTouchBrick()) {moveRight();} else {break;}
                   try {
                       Thread.sleep(200);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
                 break;
       }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            setDirection(new Random().nextInt(0,4));
        }
        }



}
