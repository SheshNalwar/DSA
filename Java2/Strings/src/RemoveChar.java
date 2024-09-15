public class RemoveChar {
    public static void main(String[] args) {
//        remove("","baccad");
        remove2("baccad");
    }
    static void remove2(String name){
        String ans = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)!='a'){
                ans+=name.charAt(i);
            }
        }
        System.out.println(ans);
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
