public class MatrixMultiplication {
    public static void main(String[] args) {

        int matrix[][] = { { 2, 4, 1, 2 }, { 8, 4, 3, 6 }, { 1, 7, 9, 5 } };
        int matrix2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 4, 5, 6 } };

        int n1 = matrix.length;
        int n2 = matrix[0].length;
        int n3 = matrix2[0].length;
        multiplication(matrix, matrix2, n1, n2, n3);
    }

    public static void multiplication(int m1[][], int m2[][], int n1, int n2, int n3) {
        int ans[][] = new int[n1][n3];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n3; j++) {
                for (int k = 0; k < n2; k++) {
                    ans[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
