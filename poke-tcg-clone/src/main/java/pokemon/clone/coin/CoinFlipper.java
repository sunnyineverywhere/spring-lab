package pokemon.clone.coin;

import java.util.Random;

public class CoinFlipper {
    private Random random;
    public CoinFlipper() {
        random = new Random();
    }

    public Coin flip(Coin coin) {
        CoinFace result = random.nextBoolean() ? CoinFace.HEADS : CoinFace.TAILS;
        coin.setCurrentFace(result);
        System.out.println("동전 결과: " + result);
        return coin;
    }
}
