public class RemoveChar {
    public static void main(String[] args) {
        recurseRemove("","baccad");
//        System.out.println(remove2("baccad"));
    }
    static String remove2(String name){
        String ans = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)!='a'){
                ans+=name.charAt(i);
            }
        }
        return ans;
    }
    static void recurseRemove(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch=='a'){
            recurseRemove(p,up.substring(1));
        }else {
            recurseRemove(p+ch,up.substring(1));
        }
    }
}
