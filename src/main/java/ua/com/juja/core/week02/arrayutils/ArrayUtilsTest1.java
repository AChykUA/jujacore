package ua.com.juja.core.week02.arrayutils;

/**
 * Created by CooLlGhosT on 28.07.2017.
 */
import java.util.Arrays;

public class ArrayUtilsTest1 {
    public static void main(String[] args) {
        int[][] oldArray = {
                {0, 1},
                {2, 3}};
        int[][] newExpectedArray = {
                {2, 0},
                {3, 1}};
        int[][] newActualArray = ArrayUtils.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
