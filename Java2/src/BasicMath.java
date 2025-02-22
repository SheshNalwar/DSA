public class BasicMath {
    public static void main(String[] args) {
        System.out.println(prime(7));
    }
    static int count(int n){
        int count = 0;
        while (n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    static int reverse(int n){
        int rev = 0;
        while (n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    static boolean palindrome(int n){
        int reversed = reverse(n);
        if (reversed==n)return true;
        return false;
    }
    static void divisors(int n){
        for (int i = 1; i <= n; i++) {
            if (n%i==0) System.out.print(i+" ");
        }
    }
    static int gcd(int n1,int n2){
        int gcd =1;
        for (int i = 1; i < Math.min(n1,n2); i++) {
            if (n1%i==0 && n2%i==0)gcd=i;
        }
        return gcd;
    }
    static boolean prime(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0)count++;
        }
        if (count>2)return false;
        return true;
    }
//    static boolean armStrong(int n){
//        
//    }
}
