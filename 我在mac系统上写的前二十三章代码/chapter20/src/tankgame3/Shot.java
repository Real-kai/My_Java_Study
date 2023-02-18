package tankgame3;

import java.io.Serializable;
import java.util.Vector;

/**
 * @author 王凯
 * @version 1.0
 */
public class Shot implements Runnable , Serializable {
    int x ;
    int y;
    int direction;
    int speed=10;
    boolean isLive = true;
 private Vector<Boom> booms ;


    public Shot(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void setBooms(Vector<Boom> booms) {
        this.booms = booms;
    }

    public boolean isTouchIron(){
        if (x>150&&x<950&&y>250&&y<290){return true;}
        return false;
    }

    @Override
    public void run() {
        while(true){
            if (!(x>=0&&x<=1080&&y>=0&&y<=720&&isLive&&!isTouchIron())){
                isLive=false;
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            switch(direction){
            case 0:y-=speed;
            break;
            case 1:y+=speed;
                break;
            case 2:x-=speed;
                break;
            case 3:x+=speed;
                break;
        }
        }
    }
}
