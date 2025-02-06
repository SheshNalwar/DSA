public class CountDigits {
    public static void main(String[] args) {
        int n = 1234521825;
        System.out.println(countRevision(n));
    }
    static int count(int n){
        int totalCount=0;
        while (n!=0){
            n=n/10;
            totalCount++;
        }
        return totalCount;
    }
    static int countRevision(int n){
        int count = 0;
        while (n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
}
