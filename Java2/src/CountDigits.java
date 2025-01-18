public class CountDigits {
    public static void main(String[] args) {
        int n = 1234521825;
        System.out.println(count(n));
    }
    static int count(int n){
        int totalCount=0;
        while (n!=0){
            n=n/10;
            totalCount++;
        }
        return totalCount;
    }
}
