

/**
 *
 * @author royshawnmcclain
 */
public class Stock {

    public String symbol;
    public String name;
    double previousClosingPrice;
    double currentPrice;
    double changePercent;

    //Default Constructor
    

    //Specified Constructor
    
    //Added this
    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    
    Stock() {
        this("ORCL", "Oracle Corporation");
    }

    double setChangePercent() {
        changePercent = ((previousClosingPrice-currentPrice)/100)*100;
        return changePercent;
    }
    
    double getChangePercent()
    {
    return changePercent;
    }

    double setCurrentPrice(double currentPrice) {
        //Added "this" keyword.
        this.currentPrice = currentPrice;
        return currentPrice;
    }

    double getCurrentPrice() {
        return currentPrice;
    }

    double setpreviousClosingPrice(double price) {
        previousClosingPrice = price;
        return previousClosingPrice;
    }

    double getpreviousClosingPrice() {
        return previousClosingPrice;
    }

    void printInfo() {
        System.out.println("The current price is: $" + currentPrice + ".");
        System.out.println("The previous set price is: $" + previousClosingPrice + ".");
        
        System.out.println("The change in percentage is: %" + changePercent);
    }

}
