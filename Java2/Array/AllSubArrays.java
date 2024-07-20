public class AllSubArrays {
    public static void main(String[] args) {
        int arr[] = { -5, 4, 6, -3, 4, -1 };
        subArrays(arr);
    }

    static void subArrays(int arr[]) {
        System.out.println("Subarrays are : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print("{ " + arr[k] + " }" + ",");
                }
                System.out.println();
            }
        }
    }
}
