package pokemon.clone.coin;

import java.util.List;

public class CoinTossService {
    private final CoinFlipper coinFlipper;

    public CoinTossService(CoinFlipper coinFlipper) {
        this.coinFlipper = coinFlipper;
    }

    public Coin flip(Coin coin) {
        return coinFlipper.flip(coin);
    }

    public int flipUntilTails(Coin coin) {
        int count = 0;
        while (coinFlipper.flip(coin).getCurrentFace() == CoinFace.HEADS) {
            count++;
        }
        return count;
    }

    public int flipMultiple(Coin coin, int energyCount) {
        int count = 0;
        for (int i = 0; i< energyCount; i++) {
            if(coinFlipper.flip(coin).getCurrentFace() == CoinFace.HEADS) {
                count++;
            }
        }
        return count;
    }
}
