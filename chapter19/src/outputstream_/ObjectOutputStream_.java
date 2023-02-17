package outputstream_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author 王凯
 * @version 1.0
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/date.dat"));
        oos.writeInt(100);
        oos.writeDouble(100.0);
        oos.writeBoolean(true);
        oos.writeUTF("hello,wangkai");
        oos.writeObject(new Dog("xiaobai",10));

        oos.close();
    }
}

