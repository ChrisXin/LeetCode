import java.util.Arrays;

public class Solution {
 public int maxProfit(int[] prices) {
    if(prices.length<=1) return 0;
    int buy=Integer.MAX_VALUE;
    int max_profit=0;

    for(int i=0;i<prices.length;i++){
        max_profit=Math.max(max_profit,prices[i]-buy);
        buy=Math.min(buy,prices[i]);
        }
    return max_profit;
    }
}
