package doubleTypes;

import java.math.BigDecimal;

public class DoubleExample {

    public static void calculatePrimitiveDouble() {
        double d1 = 1.8;
        double d2 = 0.83;
        double r = d1 - d2;
        System.out.println("double Result : " + r);
    }

    public static void calculateReferenceDouble() {
        Double d1 = 1.8;
        Double d2 = 0.83;
        Double r = d1 - d2;
        System.out.println("Double Result : " + r);
    }

    public static void calculateBigDecimal() {
        BigDecimal bd1 = new BigDecimal("1.8");
        BigDecimal bd2 = new BigDecimal("0.83");
        BigDecimal r = bd1.subtract(bd2);
        System.out.println("BigDecimal Result : " + r);
    }

    public static void main(String[] args) {
        calculatePrimitiveDouble(); //double Result : 0.9700000000000001
        calculateReferenceDouble(); //Double Result : 0.9700000000000001
        calculateBigDecimal(); //BigDecimal Result : 0.97
    }
}
