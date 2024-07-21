public class BinarySearch {
    public static void main(String[] args) {
        int ar[] = { 1, 22, 33, 44, 55, 66, 77, 88, 99, 100 };
        int key = 81;
        System.out.println(binarySearch(ar, key));
    }

    static int binarySearch(int ar[], int key) {
        int low = 0, high = ar.length - 1, mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key == ar[mid]) {
                return mid;
            } else if (key < ar[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
