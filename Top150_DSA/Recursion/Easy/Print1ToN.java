
public class Print1ToN {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;

        print1ToN(i, n);
    }

    public static void print1ToN(int i, int n) {
        if (i > n) {
            return;
        }

        System.out.println(i);
        print1ToN(i + 1, n);
    }
}
