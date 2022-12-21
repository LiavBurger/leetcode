import java.util.ArrayList;

public class BestTimeToBuyAndSellStock_121 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2)
            return 0;

        int min = prices[0];
        int maxProfit = prices[1] - min;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];

            if (maxProfit < prices[i] - min)
                maxProfit = prices[i] - min;
        }

        return maxProfit;
    }
}
