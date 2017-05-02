/**
 * Created by prathmeshjakkanwar on 5/1/17.
 */
public class Stocks {
    public static int maxProfitWithDays(int[] prices) {
        if(prices==null||prices.length<=1)
            return 0;

        int min=prices[0]; // min so far
        int result=0;
        int buyDate = 0;
        int buyValue = prices[0];
        int sellValue = prices[1];
        int sellDate = 1;

        for(int i=1; i<prices.length; i++){
            if(buyValue > prices[i]) {
                buyDate = i;
                buyValue = prices[i];
            }

            if (prices[i] - min > result) {
                sellDate = i;
                sellValue = prices[i];
            }
            result = Math.max(result, prices[i]-min);
            min = Math.min(min, prices[i]);
        }

        System.out.println("Buy on day  : " + buyDate);
        System.out.println("Sell on day : " + sellDate);
        System.out.println("Buy price   : " + buyValue);
        System.out.println("Sell price  : " + sellValue);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,11,5,6,7,8,1,90};

        System.out.println("Profit : " + maxProfitWithDays(arr));
    }
}
