public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int price []={7,1,5,3,6,4};
        System.out.println(maxProfit(price));
    }
    static int maxProfit(int ar[]){
        int left=0;
        int right=1;
        int max_profit = 0;
        while (right< ar.length){
            if (ar[left]<ar[right]){
                int profit = ar[right]-ar[left];
                max_profit=Math.max(profit,max_profit);
            }else {
                left=right;
            }
            right++;
        }
        return max_profit;
    }
}
