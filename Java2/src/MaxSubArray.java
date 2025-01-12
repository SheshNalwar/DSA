public class MaxSubArray {
    public static void main(String[] args) {
        int ar[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(ar));
    }
    static int maxSubArray(int ar[]){
        int sum=ar[0];
        int max=ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (sum<0){
                sum=0;
            }
            sum+=ar[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}
