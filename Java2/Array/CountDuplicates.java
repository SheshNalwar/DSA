
public class CountDuplicates {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 4, 5, 6, 7, 7, 8 };
        int k = removeDuplicates(arr);
        System.out.println("No. of Elements after removal of duplicates are " + k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int arr[]) {
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}