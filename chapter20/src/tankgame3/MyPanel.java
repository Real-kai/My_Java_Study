package tankgame3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

/**
 * @author 王凯
 * @version 1.0
 */
public class MyPanel extends JPanel implements KeyListener,Runnable {


        Hero myTank;   //我的坦克

        public  Vector<Enemy> enemyVector = new Vector<>(); //敌人坦克集合
        public Vector<Boom> booms = new Vector<>();//爆炸效果图集合

        public Vector<Brick> bricks = new Vector<>();//砖块集合
        private int enemySize = 6; //敌人坦克数量
        private Image image1;
        private Image image2;
        private Image image3;


        public MyPanel(String key) throws IOException, ClassNotFoundException {//面板构造器
            File file1 = new File(Recorder.getFilePath2());

            File file2 = new File(Recorder.getFilePath3());
            if (!file1.exists()||!file2.exists()){
                System.out.println("缺少文件，只能开启新游戏");
                key  = "1";
            }

            for (int i = 0; i < 20; i++) {
                Brick brick = new Brick(150 + (40 * i), 100);
                bricks.add(brick);
            }

            switch (key){
                case "1":
                    myTank = new Hero(10,640,5);//初始化我的坦克
                    myTank.setSpeed(6);//设置我的坦克的速度
                    myTank.setBricks(bricks);
                    Tank.tanks.add(myTank);
                    for (int i = 0; i < enemySize; i++) {//创建敌人的坦克
                        //创建一个敌人坦克
                        Enemy enemy = new Enemy(100*(i+1),0,i+1);
                        enemy.setDirection(1);
                        enemy.setBricks(bricks);
                        Tank.tanks.add(enemy);
                        //启动一个坦克线程
                        new Thread(enemy).start();
                        //添加敌人坦克到集合里面
                        enemyVector.add(enemy);
                    }
                    break;
                case "2":
                    myTank = Recorder.recoverHero();//初始化我的坦克
                    myTank.shotVector.clear();
                    myTank.setSpeed(6);//设置我的坦克的速度
                    Tank.tanks.add(myTank);
                    enemyVector = Recorder.recoverEnemy();
                    for (int i = 0; i < enemyVector.size(); i++) {
                        Enemy enemy = enemyVector.get(i);
                        enemy.shotVector.clear();
                        Tank.tanks.add(enemy);
                        new Thread(enemy).start();
                    }
                    break;
                default:
                    System.out.println("请重新输入您的选择");
            }

           //启动我方坦克线程
            image1 =Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb_1.gif"));
            image2 =Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb_2.gif"));
            image3 =Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb_3.gif"));
            new AePlayWave("/Users/kai/IdeaProjects/hspedu/chapter20/src/111.wav").start();
        }
        @Override
        public void paint(Graphics g) {

            super.paint(g);
            g.fillRect(0,0,1080,720);//填充面板
            g.setColor(Color.CYAN);//画河流
            g.fillRect(150,580,800,40);
            g.setColor(Color.lightGray);
            for (int i = 0; i < 20; i++) {
                g.fill3DRect(150+(40*i),250,40,40,false);
            }

            g.setColor(Color.pink);
            for (int i = 0; i < bricks.size(); i++) {
                Brick brick = bricks.get(i);
              if (brick!=null&&brick.isLive()) {g.fill3DRect(brick.getX(),brick.getY(),40,40,false);
            }else {bricks.remove(brick);}}
            showInfo(g);
            g.setColor(Color.RED);//设置画笔颜色
            for (int i = 0; i < booms.size(); i++) {//绘制爆炸效果
                if (booms==null){break;}
                Boom boom = booms.get(i);
                    if(boom.lifeTime>6){
                g.drawImage(image1,boom.x,boom.y,60,60,this);

                    }
                   else if (boom.lifeTime>3){
                g.drawImage(image2,boom.x,boom.y,60,60,this);}
                   else {
                g.drawImage(image3,boom.x,boom.y,60,60,this);}
                boom.lifeDown();

               if(boom.lifeTime==0){booms.remove(boom);}

            }

            if (myTank!=null&&myTank.isLive){//绘制我方坦克
            drawTank(myTank.getX(),myTank.getY(),g,0,myTank.getDirection() );}
            for (int i = 0; i < myTank.shotVector.size(); i++) {//绘制我方子弹
                Shot shot = myTank.shotVector.get(i);
                if (shot.isLive){
                    drawShot(shot.x,shot.y,g);
                }else {myTank.shotVector.remove(i);}
            }

            for (int i = 0; i < enemyVector.size(); i++){//绘制敌人坦克
                Enemy enemy = enemyVector.get(i);
                if (enemy!=null&&enemy.isLive){
                drawTank(enemy.getX(),enemy.getY(),g,1,enemy.getDirection());}else {Tank.tanks.remove(enemy);enemyVector.remove(enemy);Recorder.addKillNum();}

                for (int j = 0; j < enemy.shotVector.size(); j++) {//绘制敌方子弹
                    Shot shot = enemy.shotVector.get(j);
                    if (shot.isLive){
                        drawShot(shot.x,shot.y,g);
                    }else {enemy.shotVector.remove(j);}
                }
            }
            // drawTank(tank.getX()+60,tank.getY(),g,0,0);
        }

        public void hitEnemy(){//射击敌人
            for (int i = 0; i < myTank.shotVector.size(); i++) {
                Shot shot = myTank.shotVector.get(i);
                for (int j = 0; j < enemyVector.size(); j++) {
                    Enemy enemy = enemyVector.get(j);
                    hitTank(shot,enemy);
                }
            }
        }

        public void hitHero(){//射击我方坦克
            if (!myTank.isLive){return;}
            for (int i = 0; i < enemyVector.size(); i++) {
                Enemy enemy = enemyVector.get(i);
                for (int j = 0; j < enemy.shotVector.size(); j++) {
                    Shot shot = enemy.shotVector.get(j);
                    hitTank(shot,myTank);
                }
            }
        }



        //射击坦克
        public  void hitTank(Shot shot,Tank tank){

            switch(tank.getDirection()){
                case 0:
                case 1:if (shot.x>tank.getX()&&shot.x<tank.getX()+40&&shot.y<tank.getY()+60&&shot.y>tank.getY())
                {--tank.blood;if (tank.blood==0){tank.isLive=false;}
                    shot.isLive=false;booms.add(new Boom(tank.getX(),tank.getY()));}
                    break;

                case 2:
                case 3:if (shot.x>tank.getX()&&shot.x<tank.getX()+60&&shot.y<tank.getY()+40&&shot.y>tank.getY())
                {--tank.blood;if (tank.blood==0){tank.isLive=false;}shot.isLive=false;booms.add(new Boom(tank.getX(),tank.getY()));}
                    break;
        }}


    public void shotBrick(Shot shot,Brick brick){
          if (shot.x>brick.getX()&&shot.x<brick.getX()+40&&shot.y>brick.getY()&&shot.y<brick.getY()+40){
              shot.isLive=false;brick.blood--;booms.add(new Boom(brick.getX(),brick.getY()));
              if (brick.blood==0){brick.isLive=false;}
          }
    }

    public void shotBricks(){
        for (int i = 0; i < myTank.shotVector.size(); i++) {
            Shot shot = myTank.shotVector.get(i);
            for (int j = 0; j < bricks.size(); j++) {
                Brick brick = bricks.get(j);
                shotBrick(shot,brick);
            }
        }

        for (int i = 0; i < enemyVector.size(); i++) {
            Enemy enemy = enemyVector.get(i);
            for (int j = 0; j < enemy.shotVector.size(); j++) {
                Shot shot = enemy.shotVector.get(j);
                for (int l = 0; l < bricks.size(); l++) {
                    Brick brick = bricks.get(l);
                    shotBrick(shot,brick);
                }
            }
        }
    }
    public void showInfo(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(1080,0,200,720);
        drawTank(1100,80,g,1,0);
        g.setColor(Color.BLACK);
        Font font = new Font("宋体", Font.BOLD, 20);
        g.setFont(font);
        g.drawString("您累计击毁的坦克数",1090,50);
        g.setColor(Color.RED);
        g.drawString(""+Recorder.getKillNum(),1160,115);
    }
        public void drawShot(int x,int y,Graphics g){
            g.fill3DRect(x,y,4,4,false);
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
            myTank.setDirection(1);
            if (myTank.getY()<660&&!myTank.isTouch()&&!myTank.isTouchRiver()&&!myTank.isTouchIron()&&!myTank.isTouchBrick()){
          myTank.moveDown();}
        }
        else if (e.getKeyCode()==KeyEvent.VK_UP) {
            myTank.setDirection(0);
            if (myTank.getY()>0&&!myTank.isTouch()&&!myTank.isTouchRiver()&&!myTank.isTouchIron()&&!myTank.isTouchBrick()){
            myTank.moveUp();}
        }
        else if (e.getKeyCode()==KeyEvent.VK_RIGHT){
            myTank.setDirection(3);
            if (myTank.getX()<1020&&!myTank.isTouch()&&!myTank.isTouchRiver()&&!myTank.isTouchIron()&&!myTank.isTouchBrick()){
          myTank.moveRight();}
        }
        else if (e.getKeyCode()==KeyEvent.VK_LEFT){
            myTank.setDirection(2);
            if (myTank.getX()>0&&!myTank.isTouch()&&!myTank.isTouchRiver()&&!myTank.isTouchIron()&&!myTank.isTouchBrick()){
            myTank.moveLeft();}
        }
        else if (e.getKeyCode()==KeyEvent.VK_J){
           myTank.shotEnemyTank();
        this.repaint();}
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hitHero();
            hitEnemy();
            shotBricks();
            this.repaint();}
    }
}

