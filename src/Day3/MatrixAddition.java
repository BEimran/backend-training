package Day3;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] mat2 = {{5, 6}, {7, 8}};
        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

