package exception_.customException;

import org.w3c.dom.ls.LSOutput;

/**
 * @author 王凯
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 34;
        if(!(age<=120&&age>=18)){
        throw new AgeException("您输入的年龄有误,不是正确的年龄范围");
        }
        System.out.println("年龄范围正确");
    }
}
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
