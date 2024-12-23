package Object_Oriented_Programs;

import java.util.ArrayList;
import java.util.List;

public class StockAccount {
    public List<CompanyShares> list;
    public String filename;

    public StockAccount(String filename) {
        this.filename = filename;
        this.list = new ArrayList<>();
        System.out.println("Stock Account initialized with file: " + filename);
    }

    public double valueOf() {
        double total = 0.0;
        for (CompanyShares share : list) {
            // Assume each share is worth 10
            total+=share.getNumberOfShares() * 10;
        }
        return total;
    }

    public void buy(int new_share, String symbol) {
        for (CompanyShares share : list) {
            if (share.getStockSymbol().equals(symbol)) {
                share.setNumberOfShares(share.getNumberOfShares() + new_share);
                System.out.println(symbol + "Bought " + new_share + " shares");
                return;
            }
        }
        // If stock does not exist, create a new CompanyShares object
        CompanyShares newShare = new CompanyShares(symbol, new_share);
        list.add(newShare);
        System.out.println("New stock added: " + symbol + " with " + new_share + " shares");
    }

    public void sell(int amount, String symbol) {
        for (CompanyShares share : list) {
            if (share.getStockSymbol().equals(symbol)) {
                if (share.getNumberOfShares() >= amount) {
                    share.setNumberOfShares(share.getNumberOfShares() - amount);
                    System.out.println(symbol +" Sold " + amount + " shares");
                } else {
                    System.out.println("Not enough shares to sell. Available: " + share.getNumberOfShares());
                }
                return;
            }
        }
        System.out.println(symbol + " not found");
    }
    public void save(String filename) {
        System.out.println("Account data saved to file: " + filename);
    }

    public void printReport() {
        System.out.println("\nStock Account Report:");
        for (CompanyShares share : list) {
            System.out.println(share);
        }
        System.out.println("Total Value of Shares: " + valueOf());
    }

    public static void main(String[] args) {
        StockAccount account = new StockAccount("file_name.txt");

        account.buy(500, "akshaya");
        account.buy(200, "ashika");
        account.sell(100, "akshaya");
        account.sell(50, "xyz"); // Not available stock

        account.save("file_name.txt");
        account.printReport();
    }
}

