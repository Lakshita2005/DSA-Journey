// Brute Force approach
// T.C: O(n2)
// S.C: O(1)
// class Best_time_to_buy_and_sell_stock_121 {

//     public static int maxProfit(int[] prices) {
//         int max_profit = 0;

//         for (int i = 0; i < prices.length; i++) {
//             for (int j = i + 1; j < prices.length; j++) {
//                 int profit = prices[j] - prices[i];
//                 if (profit > max_profit) {
//                     max_profit = profit;
//                 }
//             }
//         }

//         return max_profit;
//     }

//     public static void main(String[] args) {
//         int[] prices = {7, 1, 5, 3, 6, 4};
//         System.out.println("Max Profit (Brute Force): " + maxProfit(prices));
//     }
// }


// Optimized Approach
// T.C: O(n)
//S.C: O(1)
class Best_time_to_buy_and_sell_stock_121 {

    public static int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_price) {
                min_price = prices[i];
            } else {
                int profit = prices[i] - min_price;
                if (profit > max_profit) {
                    max_profit = profit;
                }
            }
        }

        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit (Optimized): " + maxProfit(prices));
    }
}
