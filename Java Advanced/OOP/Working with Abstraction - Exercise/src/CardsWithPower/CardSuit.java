package CardsWhitPower;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int typePower;

    CardSuit(int typePower){
        this.typePower = typePower;
    }

    public int getTypePower() {
        return this.typePower;
    }
}
