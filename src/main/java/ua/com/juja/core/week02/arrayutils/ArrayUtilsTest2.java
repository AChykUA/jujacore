package ua.com.juja.core.week02.arrayutils;

/**
 * Created by CooLlGhosT on 28.07.2017.
 */
public class ArrayUtilsTest2 {
    public static void main(String[] args) {
        Object res = ArrayUtils.rotateClockwise(null);
        if (res != null) {
            throw new AssertionError();
        }
        System.out.print("OK");
    }
}
