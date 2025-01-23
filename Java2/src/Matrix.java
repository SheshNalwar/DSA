public class Matrix {
    public static void main(String[] args) {
        int array1[][]={{1,2},{3,4}};
        int array2[][]={{4,3},{2,1}};
        int result[][] = add(array1, array2);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] add(int ar1[][],int ar2[][]){
        int result[][]=new int[ar1.length][ar1[0].length];
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1[i].length; j++) {
                result[i][j]=ar1[i][j]+ar2[i][j];
            }
        }
        return result;
    }
}
