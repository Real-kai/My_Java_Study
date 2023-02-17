package tankgame3;

import java.io.*;
import java.util.Vector;

/**
 * @author 王凯
 * @version 1.0
 */
public class Recorder {
    private static int killNum = 0;
    private  static BufferedWriter bw = null;
    private static BufferedReader br = null;
    private static ObjectInputStream ois =null;
    private static ObjectOutputStream oos = null;
    private static String filePath1 = "/Users/kai/IdeaProjects/hspedu/chapter20/src/myRecord.txt";
    private static String filePath2 = "/Users/kai/IdeaProjects/hspedu/chapter20/src/enemyTank1.txt";
    private static String filePath3 = "/Users/kai/IdeaProjects/hspedu/chapter20/src/enemyTank2.txt";

    public static void save(Vector<Enemy> enemys ,Hero hero) throws IOException {
        bw  = new BufferedWriter(new FileWriter(filePath1));
        bw.write(killNum+"");
        bw.newLine();
        bw.close();
        ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(filePath2));
        ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(filePath3));
        oos1.writeObject(enemys);
        oos2.writeObject(hero);
        oos1.close();
        oos2.close();
        System.out.println("保存成功");
    }


    public static Vector<Enemy> recoverEnemy( ) throws IOException, ClassNotFoundException {
        br = new BufferedReader(new FileReader(filePath1));
        killNum  = Integer.parseInt( br.readLine());
        br.close();
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(filePath2));
        Vector<Enemy> o = (Vector<Enemy>)ois1.readObject();
        ois1.close();
        System.out.println("读取成功");
        return o;
    }

    public static Hero recoverHero() throws IOException, ClassNotFoundException {
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(filePath3));
        Hero hero = (Hero)ois2.readObject();
        ois2.close();
        return hero;
    }

    public static String getFilePath2() {
        return filePath2;
    }

    public static void setFilePath2(String filePath2) {
        Recorder.filePath2 = filePath2;
    }

    public static String getFilePath3() {
        return filePath3;
    }

    public static void setFilePath3(String filePath3) {
        Recorder.filePath3 = filePath3;
    }

    public static int getKillNum() {
        return killNum;
    }

    public static void setKillNum(int killNum) {
        Recorder.killNum = killNum;
    }

    public static void addKillNum(){
        killNum++;
    }
}
