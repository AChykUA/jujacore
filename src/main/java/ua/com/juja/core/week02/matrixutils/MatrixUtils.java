package ua.com.juja.core.week02.matrixutils;

/**
 * Created by CooLlGhosT on 15.07.2017.
 */
public class MatrixUtils {
    public static int[][] mul(int[][] fst, int[][] snd ){
        if ( fst == null || snd == null ) {
            throw new IllegalArgumentException();
        }
        if (fst.length != fst[0].length || snd.length != snd[0].length) {
            throw new IllegalArgumentException();
        }

        if (snd.length != fst[0].length) {
            throw new IllegalArgumentException();
        }

        int m = fst.length;
        int n = snd[0].length;
        int o = snd.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += fst[i][k] * snd[k][j];
                }
            }
        }
        return res;
    }
}
