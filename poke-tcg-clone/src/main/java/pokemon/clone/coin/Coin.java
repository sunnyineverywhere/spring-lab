package pokemon.clone.coin;

public class Coin {
    private CoinFace currentFace;

    public Coin() {
        this.currentFace = null;
    }

    public CoinFace getCurrentFace() {
        return currentFace;
    }

    public void setCurrentFace(CoinFace coinFace) {
        this.currentFace = coinFace;
    }
}
