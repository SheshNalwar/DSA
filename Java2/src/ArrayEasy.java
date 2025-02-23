import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayEasy {
//    Declarations
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static HashMap<Integer,Integer> hashMap = new HashMap<>();
    static int array[]={1,2,3,4,5};
    static int array2[]={2,3,4,4,5};
    static int appears[]={2,2,1};
    static int zeroes[]={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
    static int duplicates[]={1,1,1,2,2,3,3,3,3,4,4};

//    Main
    public static void main(String[] args) {

    }

//    Methods
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
    static ArrayList<Integer> removeDuplicates(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            if (!arrayList.contains(ar[i]))arrayList.add(ar[i]);
        }
        return arrayList;
    }
    static int[] leftRotateArray(int ar[]){
        int temp = ar[0];
        for (int i = 0; i < ar.length-1; i++) {
            ar[i]=ar[i+1];
        }
        ar[ar.length-1]=temp;
        return ar;
    }
    static ArrayList<Integer> rotateByK(int ar[],int k){
        for (int i = ar.length-k; i < ar.length ; i++) {
            arrayList.add(ar[i]);
        }
        for (int i = 0; i < ar.length-k ; i++) {
            arrayList.add(ar[i]);
        }
        return arrayList;
    }
    static int[] rotateByK2(int ar[],int k){
        //TODO : incomplete
        int temp[]=new int[k];
        for (int i = ar.length-k; i < ar.length ; i++) {
            temp[i]=ar[i];
        }
        for (int i = k; i < ar.length-k ; i++) {
            
        }
        return ar;
    }
    static int[] moveAllZeros(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]!=0)arrayList.add(ar[i]);
        }
        for (int i = arrayList.size(); i <ar.length ; i++) {
            arrayList.add(0);
        }
        return ar;
    }
    static int missingNumber(int ar[]){
        for (int i = 1; i <= ar.length; i++) {
            if (ar[i]!=ar[i-1]+1)return ar[i]-1;
        }
        return -1;
    }

}
