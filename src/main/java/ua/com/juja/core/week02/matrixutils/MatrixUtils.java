package ua.com.juja.core.week02.matrixutils;

/**
 * Created by CooLlGhosT on 15.07.2017.
 */
public class MatrixUtils {
    public static int[][] mul(int[][] fst, int[][] snd ){

        if (fst == null || snd == null) throw new IllegalArgumentException();
        if (fst[0] == null || snd[0] == null) throw new IllegalArgumentException();
        if (fst[0].length != snd.length) throw new IllegalArgumentException();

        int fstWidth = fst[0].length;
        for (int i = 1; i < fst.length; i++) {
            if (fst[i] == null || fst[i].length != fstWidth) throw new IllegalArgumentException();
        }

        int sndWidth = snd[0].length;
        for (int i = 1; i < snd.length; i++) {
            if (snd[i] == null || snd[i].length != sndWidth) throw new IllegalArgumentException();
        }

        int[][] res = new int[fst.length][sndWidth];

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = 0;
                for (int k = 0; k < fstWidth; k++) {
                    res[i][j] += fst[i][k] * snd[k][j];
                }
            }
        }

        return res;
    }
}
