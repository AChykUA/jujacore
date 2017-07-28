package ua.com.juja.core.week02.arrayutils;

/**
 * Created by CooLlGhosT on 28.07.2017.
 */
public class ArrayUtilsTest3 {
    public static void main(String[] args) {
        Object res = ArrayUtils.rotateClockwise(new int[0][]);
        if (res != null) {
            throw new AssertionError();
        }
        System.out.print("OK");
    }
}
