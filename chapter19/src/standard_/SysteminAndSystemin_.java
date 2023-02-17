package standard_;

import java.util.Scanner;

/**
 * @author 王凯
 * @version 1.0
 */
public class SysteminAndSystemin_ {
    public static void main(String[] args) {
        System.out.println(System.out.getClass());

        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println("next"+next);
    }
}
