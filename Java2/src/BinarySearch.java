//The Array must be sorted !
public class BinarySearch {
    public static void main(String[] args) {
        int ar[]= {1,2,3,4,5};
        System.out.println(binarySearchRevision(ar,4));
    }
    static int binarySearch(int[] ar,int target){
        int start = 0;
        int end = ar.length-1;
        while (start<=end){
            int middle = (start+end)/2;
            if (ar[middle]==target){
                return middle;
            } else if (ar[middle]>target) {
                end=middle-1;
            }else{
                start=middle+1;
            }
        }
        return -1;
    }
    static int binarySearchRevision(int[] ar,int target){
        int start=0;
        int end = ar.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (ar[mid]==target)return mid;
            else if (ar[mid]<target) {
                start=mid+1;
            }else end=mid-1;
        }
        return -2;
    }
}
