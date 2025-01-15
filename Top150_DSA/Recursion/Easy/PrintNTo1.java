
public class PrintNTo1 {
    public static void main(String[] args) {
        int n = 10;
        int i = n;
        printNTo1(i, n);
    }

    public static void printNTo1(int i, int n) {
        if (i < 1) {
            return;
        }

        System.out.println(i);
        printNTo1(i - 1, n);
    }
}
