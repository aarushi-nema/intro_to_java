package Ch9;

/**
 * Q: Design a class named Stock that contains:
     o A string data field named symbol for the stock’s symbol.
     o A string data field named name for the stock’s name.
     o A double data field named previousClosingPrice that stores the
     stock price for the previous day.
     o A double data field named currentPrice that stores the stock price
     for the current time.
     o A constructor that creates a stock with the specified symbol and name.
     o A method named getChangePercent() that returns the percentage
     changed from previousClosingPrice to currentPrice .
     Write a test program that creates a Stock object with the stock symbol ORCL , the name
     Oracle Corporation , and the previous closing price of 34.5 . Set a new
     current price to 34.35 and display the price-change percentage.
 * Created by aarushi on 16/6/21.
 */
public class Ex02Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Ex02Stock(String symbol, String name){
        this.symbol= symbol;
        this.name= name;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(){
        return ((currentPrice-previousClosingPrice)/previousClosingPrice);
    }

    /*
    Sample Output:
    Percentage change of stock price of Oracle Corporation is -0.00434782608695648%

     */
}
