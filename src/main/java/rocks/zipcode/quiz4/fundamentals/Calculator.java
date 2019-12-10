package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return Math.pow(value, 2);
    }

    public static Double[] squareRoots(Double... value) {
        for (int i = 0; i < value.length; i++) {
            value[i] = squareRoot(value[i]);
        }
        return value;
    }

    public static Double[] squares(Double... values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = square(values[i]);
        }
        return values;
    }

    public static Double add(Double value1, Double value2) {
        return value1 + value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1 - value2;
    }


    public static Double divide(Double divisor, Double dividend) {
        return divisor/dividend;
    }
}
