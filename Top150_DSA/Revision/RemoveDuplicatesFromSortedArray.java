public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3 };
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] arr) {
        int idx = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx] = arr[i];
                idx++;
            }
        }

        return idx;
    }
}