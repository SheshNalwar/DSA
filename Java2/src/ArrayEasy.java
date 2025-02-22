public class ArrayEasy {
    public static void main(String[] args) {
        int array[]={1,2,5,7,7,8};
        secondLargest(array);
    }
    static int largest(int ar[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]>largest)largest=ar[i];
        }
        return largest;
    }
    static boolean sortedOrNot(int ar[]){
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i]>ar[i+1])return false;
        }
        return true;
    }
    static int linearSearch(int ar[],int key){
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i]==key)return i;
        }
        return -1;
    }
    static void secondLargest(int ar[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]>largest)largest=ar[i];
            if (ar[i]<smallest)smallest=ar[i];
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]>secondLargest && ar[i]!=largest)secondLargest=ar[i];
            if (ar[i]<secondSmallest && ar[i]!=smallest)secondSmallest=ar[i];
        }
        System.out.println("Second Largest "+secondLargest);
        System.out.println("Second Smallest "+secondSmallest);
    }

}
