package week02.parser;

/**
 * Created by CooLlGhosT on 12.07.2017.
 */
public class Test1 {
        public static void main(String[] args) {
            if (Parser.eval("(123+321)-1") != 443) {
                throw new AssertionError();
            }

            System.out.print("OK");
        }
}
