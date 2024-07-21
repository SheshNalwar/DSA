public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int nums[] = { 0, 10, 22, 8, 0, 5, 0 };
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    static void moveZeroes(int nums[]) {
        int nz = 0, z = 0;
        while (nz < nums.length) {
            if (nums[nz] != 0) {
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
    }
}
