import java.util.ArrayList;
import java.util.Arrays;

public class ArrayEasy {
    public static void main(String[] args) {
        for(int num:D.ar2){
            int current = D.intHashMap.getOrDefault(num,1);
            System.out.println(current);
        }
    }

//    Methods
    static int largest(int[] ar){
        int largest = Integer.MIN_VALUE;
        for (int j : ar) {
            if (j > largest) largest = j;
        }
        return largest;
    }
    static boolean sortedOrNot(int[] ar){
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i]>ar[i+1])return false;
        }
        return true;
    }
    static int linearSearch(int[] ar, int key){
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i]==key)return i;
        }
        return -1;
    }
    static void secondLargest(int[] ar){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int k : ar) {
            if (k > largest) largest = k;
            if (k < smallest) smallest = k;
        }
        for (int j : ar) {
            if (j > secondLargest && j != largest) secondLargest = j;
            if (j < secondSmallest && j != smallest) secondSmallest = j;
        }
        System.out.println("Second Largest "+secondLargest);
        System.out.println("Second Smallest "+secondSmallest);
    }
    static ArrayList<Integer> removeDuplicates(int[] ar){
        for (int j : ar) {
            if (!D.intArrayList.contains(j)) D.intArrayList.add(j);
        }
        return D.intArrayList;
    }
    static int[] leftRotateArray(int[] ar){
        int temp = ar[0];
        for (int i = 0; i < ar.length-1; i++) {
            ar[i]=ar[i+1];
        }
        ar[ar.length-1]=temp;
        return ar;
    }
    static ArrayList<Integer> rotateByK(int[] ar, int k){
        for (int i = ar.length-k; i < ar.length ; i++) {
            D.intArrayList.add(ar[i]);
        }
        for (int i = 0; i < ar.length-k ; i++) {
            D.intArrayList.add(ar[i]);
        }
        return D.intArrayList;
    }
    static int[] moveAllZeros(int[] ar){
        for (int j : ar) {
            if (j != 0) D.intArrayList.add(j);
        }
        for (int i = D.intArrayList.size(); i <ar.length ; i++) {
            D.intArrayList.add(0);
        }
        return ar;
    }
    static int missingNumber(int[] ar){
        for (int i = 1; i <= ar.length; i++) {
            if (ar[i]!=ar[i-1]+1)return ar[i]-1;
        }
        return -1;
    }
    static int consecutiveOnes(int[] ar){
        int count = 0;
        int maxCount = 0;
        for (int j : ar) {
            if (j == 1) count++;
            else count = 0;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
    static int appearsOnce(int[] ar){
        for (int j : ar) {
            if (!D.intHashMap.containsKey(j)) D.intHashMap.put(j, 1);
            else D.intHashMap.put(j, D.intHashMap.get(j) + 1);
        }
        for (int key : D.intHashMap.keySet()) {
            if (D.intHashMap.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }
    static int[] twoSum(int[] ar, int target){
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i]+ar[j]==target)return new int[]{i,j};
            }
        }
        return new int[]{};
    }
    static boolean twoSum(int target, int[] ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i]+ar[j]==target)return true;
            }
        }
        return false;
    }
}
