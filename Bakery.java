public class Bakery extends Cake {
    
    int candles;

    public Bakery() {
        super();
        this.flavor = "Chocolate";
        this.price = 9.99;
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
