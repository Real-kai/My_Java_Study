package homework; /**
 * @author 王凯
 * @version 1.0
 */
import java.util.Scanner;
class Test01 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        //String next = sca.next();//读入下一个输入对象  空格作为分隔符 i'm
        String next = sca.nextLine();//读入当前行的所有输入 i'm a boy
        System.out.println(next);
    }
}
