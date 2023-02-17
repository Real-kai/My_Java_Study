package tankgame3;

/**
 * @author 王凯
 * @version 1.0
 */
public class Boom{
    int x;
    int y;
    int lifeTime=9;
    boolean isLife=true;

    public Boom(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void lifeDown(){
        if (lifeTime>0){--lifeTime;}
        if (lifeTime==0){isLife=false;}
    }
}
