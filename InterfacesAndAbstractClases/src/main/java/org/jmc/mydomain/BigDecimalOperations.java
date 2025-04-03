package org.jmc.mydomain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    public static double roundedToNearest(BigDecimal a) {
        return a.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    public static double reverseSignAndRound(BigDecimal a) {
        return a.multiply(new BigDecimal(-1)).setScale(1, RoundingMode.HALF_EVEN).doubleValue();
    }

    public static void main(String[] args) {

        System.out.println(roundedToNearest(new BigDecimal("4.2545")));

        System.out.println("part 2 =========================================");
        System.out.println(reverseSignAndRound(new BigDecimal("1.2345")));
        System.out.println(reverseSignAndRound(new BigDecimal("-45.67")));
    }
}
