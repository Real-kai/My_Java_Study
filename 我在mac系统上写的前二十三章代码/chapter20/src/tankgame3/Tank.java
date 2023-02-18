package tankgame3;

import java.io.Serializable;
import java.util.Vector;

/**
 * @author 王凯
 * @version 1.0
 */
public class Tank implements Serializable {
    private int x;
    private int y;
    static  Vector<Tank> tanks = new Vector<>();
    Shot shot;
    Vector<Shot> shotVector = new Vector<>();



    boolean isLive = true;
    double blood;

    private int direction;

    private int speed=5;

    private Vector<Brick> bricks ;

    public void setBricks(Vector<Brick> bricks) {
        this.bricks = bricks;
    }

    public boolean isTouchBrick(){
        for (int i = 0; i < bricks.size(); i++) {
            Brick brick = bricks.get(i);
            switch(direction){
                case 0:if (x>brick.getX()-40&&x<brick.getX()+40&&y>=brick.getY()&&y<=brick.getY()+40&&brick.isLive())
                {return true;}
                case 1:if (x>brick.getX()-40&&x<brick.getX()+40&&y+60>=brick.getY()&&y+60<=brick.getY()+40&&brick.isLive())
                {return true;}
                case 2:if (x>=brick.getX()&&x<=brick.getX()+40&&y>brick.getY()-40&&y<brick.getY()+40&&brick.isLive())
                {return true;}
                case 3:if (x+60>=brick.getX()&&x+60<=brick.getX()+40&&y>brick.getY()-40&&y<brick.getY()+40&&brick.isLive())
                {return true;}
            }
        }
        return false;
    }
    public boolean isTouchIron(){
        switch (direction){
            case 0:if (x>110&&x<950&&y>=250&&y<=290){return true;}break;
            case 1:if (x>110&&x<950&&y+60>=250&&y+60<=290){return true;}break;
            case 2:if (x>=150&&x<=950&&y>210&&y<290){return true;}break;
            case 3:if (x+60>=150&&x+60<=950&&y>210&&y<290){return true;}break;
        }
        return false;
    }

    public boolean isTouchRiver(){
        switch (direction){
            case 0:if (x>110&&x<950&&y>=580&&y<=620){return true;}break;
            case 1:if (x>110&&x<950&&y+60>=580&&y+60<=620){return true;}break;
            case 2:if (x>=150&&x<=950&&y>540&&y<620){return true;}break;
            case 3:if (x+60>=150&&x+60<=950&&y>540&&y<620){return true;}break;
        }
        return false;
    }

    public boolean isTouch(){
        for (int i = 0; i < tanks.size(); i++) {
            Tank tank = tanks.get(i);
            if (this == tank){continue;}
            else {
                switch (this.getDirection()){
                    case 0:switch(tank.getDirection()){
                        case 0:
                        case 1:if (this.getX()<tank.getX()+40&&this.getX()>tank.getX()-40
                                &&this.getY()<=tank.getY()+60&&this.getY()>=tank.getY()){;return true;}
                        case 2:
                        case 3:if (this.getX()<tank.getX()+60&&this.getX()>tank.getX()-40
                                &&this.getY()<=tank.getY()+40&&this.getY()>=tank.getY()){;return true;}
                    } break;
                    case 1:switch(tank.getDirection()){
                        case 0:
                        case 1:if (this.getX()<tank.getX()+40&&this.getX()>tank.getX()-40
                                &&this.getY()+60>=tank.getY()&&this.getY()+60<=tank.getY()+60){;return true;}
                        case 2:
                        case 3:if (this.getX()<tank.getX()+60&&this.getX()>tank.getX()-40
                                &&this.getY()+60>=tank.getY()&&this.getY()<=tank.getY()+40){;return true;}
                    } break;
                    case 2 :switch(tank.getDirection()){
                        case 0:
                        case 1:if (this.getY()<tank.getY()+60&&this.getY()>tank.getY()-40
                                &&this.getX()<=tank.getX()+40&&this.getX()>=tank.getX()){return true;}
                        case 2:
                        case 3:if (this.getY()<tank.getY()+40&&this.getY()>tank.getY()-40
                                &&this.getX()<=tank.getX()+60&&this.getX()>=tank.getX()){return true;}
                    } break;
                    case 3 :switch(tank.getDirection()){
                        case 0:
                        case 1:if (this.getY()<tank.getY()+60&&this.getY()>tank.getY()-40
                                &&this.getX()+60>=tank.getX()&&this.getX()<=tank.getX()+40){return true;}
                        case 2:
                        case 3:if (this.getY()<tank.getY()+40&&this.getY()>tank.getY()-40
                                &&this.getX()+60>=tank.getX()&&this.getX()<=tank.getX()+60){return true;}
                    } break;
                }
            }
        }return false;
    }


    public int getSpeed() {return speed;}

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void moveUp(){
        y-=speed;
    }

    public void moveDown(){
        y+=speed;
    }

    public void moveLeft(){x-=speed;}

    public void moveRight(){
        x+=speed;
    }

    public Tank(int x, int y,double blood) {
        this.x = x;
        this.y = y;
        this.blood = blood;

    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
