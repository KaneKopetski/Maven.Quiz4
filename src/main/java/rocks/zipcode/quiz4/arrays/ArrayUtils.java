package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[(int)Math.floor(values.length/2)];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] result = new String[values.length-1];
        for(int i= 0; i<values.length/2; i++){
            result[i] = values[i];
        }
        for(int i= values.length/2 ; i<result.length; i++){
            result[i] = values[i+1];
        }
        return result;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] result = new String[values.length-1];
        for(int i = 0; i <values.length-1; i++)
            result[i] = values[i];
        return result;
    }
}