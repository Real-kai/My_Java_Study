package homework;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 王凯
 * @version 1.0
 */
public class HomeWork02 {
    /**
     * 
     * @param args
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws IOException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException, NoSuchMethodException, InvocationTargetException {
        Class<?> fileClass = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = fileClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
            
        }

        Constructor<?> fileConstructor = fileClass.getDeclaredConstructor(String.class);
        Object o = fileConstructor.newInstance("/Users/kai/myNews.txt");
      File file = (File) o;
//        file.createNewFile();
        Method createNewFile = fileClass.getMethod("createNewFile");
        createNewFile.invoke(o);

    }
}
