
public class PrintNameNTimes {
    public static void main(String[] args) {
        int n = 4;
        int i = 1;

        printNames(i, n);
    }

    public static void printNames(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Shesh");

        printNames(i + 1, n);
    }
}
