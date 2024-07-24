import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class IntersectionArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3 };
        System.out.println(intersection(arr1, arr2));
    }

    static int intersection(int arr1[], int arr2[]) {
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        int size = intersectionSet.size();
        return size;
    }
}
