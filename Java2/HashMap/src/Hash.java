import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        String name = "Umesh";
        String name2 = "Yogesh";
        int hashcode = name.hashCode();
        int hashcode2 = name2.hashCode();
//        System.out.println(hashcode);
//        System.out.println(hashcode2);
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Umesh",1);
        map.put("Yogesh",2);
        map.put("Vignesh",3);
        map.put("Mithilesh",4);
        System.out.println(map);
        System.out.println(map.get("Umesh"));
    }
}
