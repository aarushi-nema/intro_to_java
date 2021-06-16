package Ch9;

/**
 * Created by aarushi on 16/6/21.
 */
public class Ex02StockTest {
    public static void main(String [] args){
        Ex02Stock stock1= new Ex02Stock("ORCL", "Oracle Corporation");
        stock1.setPreviousClosingPrice(34.5);
        stock1.setCurrentPrice(34.35);
        System.out.println("Percentage change of stock price of " + stock1.name + " is " + stock1.getChangePercent()+"%");
    }
}
