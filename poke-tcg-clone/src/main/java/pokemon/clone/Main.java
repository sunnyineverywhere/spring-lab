package pokemon.clone;

import pokemon.clone.coin.Coin;
import pokemon.clone.coin.CoinFlipper;
import pokemon.clone.coin.CoinTossService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Coin coin = new Coin();
        CoinFlipper flipper = new CoinFlipper();
        CoinTossService coinTossService = new CoinTossService(flipper);

        int countUntilTails = coinTossService.flipUntilTails(coin);
        System.out.println("뒷면이 나오기 전까지 앞면이 나온 횟수: " + countUntilTails);
    }
}