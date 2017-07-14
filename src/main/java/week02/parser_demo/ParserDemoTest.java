package week02.parser_demo;

/**
 * Created by CooLlGhosT on 12.07.2017.
 */
public class ParserDemoTest {
    public static void main(String[] args) {
        System.out.println(">> 123 = " + ParserDemo.eval("123"));
        System.out.println(">> 2*3 = " + ParserDemo.eval("2*3"));
        System.out.println(">> 2*(1+3) = " + ParserDemo.eval("2*(1+3)"));
        System.out.println(">> 1+(5-2*(13/6)) = " + ParserDemo.eval("1+(5-2*(13/6))"));
    }
}
