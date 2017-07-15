package ua.com.juja.core.week02.permutator;

import java.util.Arrays;

/**
 * Created by CooLlGhosT on 15.07.2017.
 */
public class Permutator {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permutation(arr, arr.length);
    }
    public static void permutation(int[] list, int size) {
        if (size < 2) {
            System.out.println(Arrays.toString(list));
        } else {
            for (int k = 0; k < size; k++) {
                swap(list, k, size - 1);
                permutation(list, size - 1);
                swap(list, k, size - 1);
            }
        }
    }
    public static void swap(int[] list, int indexA, int indexB) {
        int tmp = list[indexA];
        list[indexA] = list[indexB];
        list[indexB] = tmp;
    }
}
