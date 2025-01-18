public class Prime {
    public static void main(String[] args) {
        System.out.println(prime(47));
    }
    static boolean prime(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0){
                count++;
            }
        }
        if (count==2){
            return true;
        }
        else return false;
    }
}
