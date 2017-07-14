package week02.quiz11;

/**
 * Created by CooLlGhosT on 13.07.2017.
 */
public class App1 {
    public static void main(String[] args) {
        System.out.println(f(5, 3));
    }
    public static int f(int a, int b) {
        return (b == 0) ? a : f(a + 1, b - 1);
    }
}
