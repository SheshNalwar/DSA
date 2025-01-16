public class SecondLargest {
    public static void main(String[] args) {
        int array[]={12, 77, 1, 88, 40, 1};
        System.out.println(secondLargest(array));
    }
    static int secondLargest(int ar[]){
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]>max){
                max=ar[i];
            }
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]>secondMax && ar[i]!=max){
                secondMax=ar[i];
            }
        }
        return secondMax;
    }

}
