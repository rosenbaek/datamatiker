public class Stocks {
    private String name;
    private String symbol;
    private double price;
    private String api;
    private int volume;
    private double bought_soldPrice;

    public Stocks(String name, String symbol, double price, String api, int volume, double bought_soldPrice) {
        this.name = name;
        this.symbol = symbol;
        this.price = price;
        this.api = api;
        this.volume = volume;
        this.bought_soldPrice = bought_soldPrice;
    }

    public String getName() {
        return name;
    }

    public String getApi() {
        return api;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public double getPrice()
    {
        return price;
    }

    public int getVolume()
    {
        return volume;
    }

    public double getBought_soldPrice()
    {
        return bought_soldPrice;
    }

    @Override
    public String toString()
    {
        return "Stocks{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", bought_soldPrice=" + bought_soldPrice +
                '}';
    }
}
