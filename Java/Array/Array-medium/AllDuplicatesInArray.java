/*
 * import java.util.ArrayList;
 * import java.util.HashSet;
 * 
 * public class AllDuplicatesInArray {
 * public static void main(String[] args) {
 * int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
 * 
 * ArrayList<Integer> duplicates = findDuplicate(nums);
 * 
 * 
 * System.out.println("Duplicates in the array: " + duplicates);
 * }
 * 
 * public static ArrayList<Integer> findDuplicate(int nums[]) {
 * ArrayList<Integer> duplicates = new ArrayList<>();
 * HashSet<Integer> seen = new HashSet<>();
 * 
 * for (int num : nums) {
 * if (!seen.add(num)) {
 * duplicates.add(num);
 * }
 * }
 * 
 * return duplicates;
 * }
 * }
 */