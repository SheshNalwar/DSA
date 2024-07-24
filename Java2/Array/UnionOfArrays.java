import java.util.TreeSet;

public class UnionOfArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3 };
        System.out.println(findUnion(arr1, arr2));
    }

    static int findUnion(int arr1[], int arr2[]) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        int size = set.size();
        return size;
    }
}
