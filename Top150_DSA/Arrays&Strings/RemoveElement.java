
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        // int j = 0;
        // int[] temp = new int [nums.length];
        // for(int i = 0; i < nums.length; i++){
        // if(nums[i] != val){
        // temp[j] = nums[i];
        // j++;
        // k++;
        // }
        // }

        // for(int i = 0; i < temp.length; i++){
        // nums[i] = temp[i];
        // }

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(nums[i] + " , i = " + i);
        }
        return k;
    }
}
