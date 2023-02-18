package inputstream_;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author 王凯
 * @version 1.0
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/date.dat"));
        System.out.println(ois.readInt());
        System.out.println(ois.readDouble());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readUTF());
        System.out.println(ois.readObject());

        ois.close();
    }
}
