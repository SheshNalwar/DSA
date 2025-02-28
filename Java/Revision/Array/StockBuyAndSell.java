public class StockBuyAndSell {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(stockBuySell(arr));
    }

    public static int stockBuySell(int[] arr) {
        int maxProfit = 0;
        int buyPrice = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }
}
