public class TwoDArray {
    public static void main(String[] args) {
        int arr[][]={{2,21,25,27},{4,20,77,88}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Search in Array : ");
    }
    static int[] search(int arr[][],int target){
        int res[]={-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }
}
