import java.util.HashMap;
import java.util.Map;

public class AppearOnce {
    public static void main(String[] args) {
        int array[]={4,1,2,1,2};
        System.out.println(appearsOnce(array));
    }
    static int appearsOnce(int ar[]){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            int val = hashMap.getOrDefault(ar[i],0);
            hashMap.put(ar[i],val+1);
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
    
}
