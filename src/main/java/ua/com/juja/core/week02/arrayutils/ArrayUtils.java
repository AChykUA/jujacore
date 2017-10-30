package ua.com.juja.core.week02.arrayutils;

/**
 * Created by CooLlGhosT on 28.07.2017.
 */
public class ArrayUtils {
    public static int[][] rotateClockwise(int[][] arg) {
        if (arg == null ) return null;
        int d = arg.length; //d - dimension
        if (d == 0) return null;
        for (int i = 0; i < d; i++) {
            if (arg[i] == null || arg[i].length != d) return null;
        }

        int[][] res = new int[d][d];

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                res[j][d - 1 - i] = arg[i][j];
            }

        }
        return res;
    }
}
