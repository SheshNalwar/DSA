public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(stockBuyAndSell(prices));
    }

    public static int stockBuyAndSell(int[] arr) {
        int maxProfit = 0;
        int buyPrice = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = arr[i];
            }
        }

        // for (int i = 1; i < arr.length; i++) {
        // int profit = 0;
        // if (arr[i] > arr[i - 1]) {
        // profit = arr[i] - arr[i - 1];
        // }
        // maxProfit = Math.max(maxProfit, profit);
        // }

        return maxProfit;
    }
}
