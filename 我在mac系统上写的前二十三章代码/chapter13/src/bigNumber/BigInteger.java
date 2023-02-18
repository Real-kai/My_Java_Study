package bigNumber;

/**
 * @author 王凯
 * @version 1.0
 */
public class BigInteger {
    public static void main(String[] args) {
        java.math.BigInteger bigInteger = new java.math.BigInteger("1000000000000000000");
        java.math.BigInteger bigInteger1 = new java.math.BigInteger("100");
        System.out.println(bigInteger.add(bigInteger1));
        System.out.println(bigInteger.subtract(bigInteger1));
        System.out.println(bigInteger.multiply(bigInteger1));
        System.out.println(bigInteger.divide(bigInteger1));

    }
}
