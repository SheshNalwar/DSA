import java.util.HashMap;

public class HashMapRevision {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        HashMap<Integer,Integer> hashMap2 = new HashMap<>();
//        HashMap will store Key and value pairs and unordered !
        hashMap.put("Umesh",27);
        hashMap.put("Hitesh",22);
        hashMap.put("Umesh",20); //Duplicates not allowed, overrides with new val
//        put method adds the element to the hash Map
        hashMap.containsKey("Umesh");
        hashMap.containsValue(20);
//        checking for key and value in the hashmap and returns boolean
        hashMap.size();
//        size of the hashmap
//        can search for existence of Key in the hashmap
        hashMap2.put(1,1);
        if (hashMap2.containsKey(1)){
            hashMap2.put(1,hashMap2.get(1)+1);
        }
        System.out.println(hashMap2.get(1));
    }
}
