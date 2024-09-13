public class ArraySum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
//        System.out.println(sum);
        System.out.println(recurseFactorial(5));
    }
    static int recurseSum(int n){
        if (n <= 1) {
            return n;
        }
        return n+recurseSum(n-1);
    }
    static int recurseFactorial(int n){
        if (n <=1) {
            return n;
        }
        return n* recurseFactorial(n-1);
    }

}
