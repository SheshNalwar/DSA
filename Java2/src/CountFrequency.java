import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int arr[] = {10,5,10,15,10,5};
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) hashMap.put(arr[i], hashMap.get(arr[i])+1);
            else hashMap.put(arr[i], 1);
        }
        System.out.println(hashMap);
    }
}
