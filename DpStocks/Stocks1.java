package DpStocks;
// Best Time to Buy and Sell Stock
public class Stocks1 {
       
    public int maxProfit(int[] a) {
        
        int mini= a[0];
        int profit = 0 ;
    
        for(int i =1 ; i<a.length ; i++){
       
       int cost = a[i] - mini;
        profit = Math.max(profit , cost);
        mini = Math.min(mini , a[i]);
    
        }
        return profit;
    
    
    
    
        

    } 
}
