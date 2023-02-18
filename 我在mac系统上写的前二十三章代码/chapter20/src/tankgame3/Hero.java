package tankgame3;

import java.util.Vector;

/**
 * @author 王凯
 * @version 1.0
 */
public class Hero extends Tank{

    public Hero(int x, int y, double blood) {
        super(x, y, blood);
    }

    public void shotEnemyTank() {
        if (shotVector.size() == 10) {
            return;
        }
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
        new Thread(shot).start();
        shotVector.add(shot);
    }
}
