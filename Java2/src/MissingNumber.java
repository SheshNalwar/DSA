public class MissingNumber {
    public static void main(String[] args) {
        int array[]={1,2,4,5};
        System.out.println(missing(array,5));
    }
    static int missing(int ar[],int n){
        for (int i = 0; i < n-1; i++) {
            if (ar[i+1]!=ar[i]+1){
                return ar[i]+1;
            }
        }
        return -1;
    }
}

