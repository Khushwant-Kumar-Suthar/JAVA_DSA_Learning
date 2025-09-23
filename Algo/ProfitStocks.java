package JAVA_DSA_Learning.Algo;

public class ProfitStocks {
    public static int buyAndSell(int[] prices) {
        int n = prices.length;
        int buyprice = Integer.MAX_VALUE; // to track a lowest buying price
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            // day1 price[0] == 7 so +infinity is greater then 7 so update buyprice with 7
            // day2 if Price[1] == 1 so 1 less then 7 so buyprice update again and set buyprice 1
            if (buyprice < prices[i]) { //
                int profit = prices[i] - buyprice; // current profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyprice = prices[i];
            }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] price = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit is " + buyAndSell(price));
        System.out.println("Case 2 max profit:");
        int [] price1 = {7,6,4,3,1};
        System.out.println("Max Profit is "+buyAndSell(price1));
    }
}
