//I/P : "1101","1011","AND"
//O/P : "1001"
public class BinaryOperations {
    public static void main(String[] args) {
        xorOp("1101","1011");
    }
    static void andOp(String s1, String s2){
        String res="";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)=='1' && s2.charAt(i)=='1'){
                res+="1";
            }else {
                res+="0";
            }
        }
        System.out.println(res);
    }
    static void oROp(String s1, String s2){
        String res="";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)=='0' && s2.charAt(i)=='0'){
                res+="0";
            }else {
                res+="1";
            }
        }
        System.out.println(res);
    }
    static void xorOp(String s1, String s2){
        String res="";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)=='0' && s2.charAt(i)=='0' || s1.charAt(i)=='1' && s2.charAt(i)=='1'){
                res+="0";
            }else {
                res+="1";
            }
        }
        System.out.println(res);
    }
}
