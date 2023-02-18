package bigNumber;

/**
 * @author 王凯
 * @version 1.0
 */
public class BigDecimal {
    public static void main(String[] args) {
        double d = 8961.78966666999999999999999999999;
       // System.out.println(d);
        java.math.BigDecimal bigDecimal = new java.math.BigDecimal("8961.78966666999999999999999999");
        System.out.println(bigDecimal);
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("1.1");
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
        System.out.println(bigDecimal.divide(bigDecimal1, java.math.BigDecimal.ROUND_CEILING));

    }
}
