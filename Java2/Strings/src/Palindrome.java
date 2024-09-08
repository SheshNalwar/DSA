public class Palindrome {
    public static void main(String[] args) {
        String st = "ababa";
        System.out.println(optimizedplusplus(st));
    }
    static void brute(String st){
        char [] ch = st.toCharArray();
        String res = "";
        for (int i = st.length()-1; i >= 0; i--) {
            res+=ch[i];
        }
        System.out.println(res);
        if (st.equals(res)){
            System.out.println(true);
        }
    }
    static boolean optimized(String st){
        int start = 0;
        int end =st.length()-1;
        char ch[] = st.toCharArray();
        while (start<end){
            if (ch[start]==ch[end]){
                return true;
            }
            start++;
            end--;
        }
        return false;
    }
    static boolean optimizedplusplus(String st){
        for (int i = 0; i<=st.length()/2 ; i++) {
            char start = st.charAt(i);
            char end = st.charAt(st.length()-1-i);
            if (start!=end){
                return false;
            }else {
                return true;
            }
        }
        return false;
    }
}
