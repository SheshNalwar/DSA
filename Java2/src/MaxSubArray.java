public class MaxSubArray {
    public static void main(String[] args) {
        int ar[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(bruteForcemaxSubArray(ar));
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
    static int bruteForcemaxSubArray(int ar[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                int sum=0;
                for (int k = i; k <=j ; k++) {
                    sum+=ar[k];
                }
                max=Math.max(sum,max);
            }
        }
        return max;
    }
}
