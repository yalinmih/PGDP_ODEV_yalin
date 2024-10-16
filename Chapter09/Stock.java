package odevler.chapter02.Chapter09;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }

    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.printf("The change percent of the stock %s is %.2f%%\n", stock.getName(), stock.getChangePercent());
    }
}
