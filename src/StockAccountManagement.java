
import java.util.Scanner;
public class StockAccountManagement {
    private static int noOfStocks;
    private static String shareName;
    private static int noOfShare;
    private static long sharePrice;
    static long StockPrice;
    static long TotalValue;

    public static int getNoOfStocks() {
        return noOfStocks;
    }

    public static void setNoOfStocks(int noOfStocks) {
        StockAccountManagement.noOfStocks = noOfStocks;
    }

    public static String getShareName() {
        return shareName;
    }

    public static void setShareName(String shareName) {
        StockAccountManagement.shareName = shareName;
    }

    public static int getNoOfShare() {
        return noOfShare;
    }

    public static void setNoOfShare(int noOfShare) {
        StockAccountManagement.noOfShare = noOfShare;
    }

    public static long getSharePrice() {
        return sharePrice;
    }

    public static void setSharePrice(int sharePrice) {
        StockAccountManagement.sharePrice = sharePrice;
    }

    public static long getStockPrice() {
        return StockPrice;
    }

    public static void setStockPrice(int stockPrice) {
        StockPrice = stockPrice;
    }

    public static long getTotalValue() {
        return TotalValue;
    }

    public static void setTotalValue(int totalValue) {
        TotalValue = totalValue;
    }
    public void addShare() {

        // user input of Share details

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the Name of Share");
        shareName = scanner.nextLine();
        System.out.println("Enter the number of Share");
        noOfShare = scanner.nextInt();
        System.out.println("Enter the price for Share");
        sharePrice = scanner.nextInt();
        StockPrice = noOfShare * sharePrice*noOfStocks;
        System.out.println("\nValue of Stock " + shareName + " is = " + StockPrice);
        scanner.close();
    }
}