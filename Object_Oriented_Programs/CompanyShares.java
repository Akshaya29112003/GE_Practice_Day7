package Object_Oriented_Programs;

import java.time.LocalDateTime;

public class CompanyShares {
    public String symbol;
    public int noofshares;
    private LocalDateTime date;

    public CompanyShares(String symbol, int noofshares) {
        this.symbol = symbol;
        this.noofshares = noofshares;
        this.date = LocalDateTime.now();
    }

    public String getStockSymbol() {
        return symbol;
    }

    public int getNumberOfShares() {
        return noofshares;
    }

    public void setNumberOfShares(int noofshares) {
        this.noofshares = noofshares;
    }

    @Override
    public String toString() {
        return "Stock Symbol: " + symbol + " of Shares: " + noofshares + " on Date: " + date;
    }
}


