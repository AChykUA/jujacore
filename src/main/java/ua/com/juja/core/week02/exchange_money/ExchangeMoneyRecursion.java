package ua.com.juja.core.week02.exchange_money;

/**
 * Created by CooLlGhosT on 13.07.2017.
 */
public class ExchangeMoneyRecursion {
    public static void main(String[] args) {
        System.out.println(exchangeAmountOfCoinsRecursion(1, 1));
    }
    private static int[] COINS_NOMINAL = {1, 2, 5, 10, 25, 50};

    public static int exchangeAmountOfCoinsRecursion(int money) {
        return exchangeAmountOfCoinsRecursion(money, COINS_NOMINAL.length - 1);
    }

    private static int exchangeAmountOfCoinsRecursion(int money, int indexOfCoin) {
        if (money < 0 || indexOfCoin < 0) return 0;
        if (money == 0 || indexOfCoin == 0) return 1;
        return exchangeAmountOfCoinsRecursion(money, indexOfCoin - 1) + exchangeAmountOfCoinsRecursion(money - COINS_NOMINAL[indexOfCoin], indexOfCoin);
    }
}
