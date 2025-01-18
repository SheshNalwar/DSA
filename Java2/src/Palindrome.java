public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(4554));
    }
    static boolean palindrome(int n){
        int rev = 0;
        int check = n;
        while (n!=0){
            rev =rev*10+n%10;
            n=n/10;
        }
        if (check == rev ) {
            return true;
        }
        return false;
    }
}
