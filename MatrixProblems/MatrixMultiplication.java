package MatrixProblems;

public class MatrixMultiplication {
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rowsFirst = firstMatrix.length;
        int colsFirst = firstMatrix[0].length;
        int rowsSecond = secondMatrix.length;
        int colsSecond = secondMatrix[0].length;

        int[][] result = new int[rowsFirst][colsSecond];

        for (int i = 0; i < rowsFirst; i++) {
            for (int j = 0; j < colsSecond; j++) {
                for (int k = 0; k < colsFirst; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] firstMatrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int[][] secondMatrix = {
                { 7, 8 },
                { 9, 10 },
                { 11, 12 }
        };

        int[][] resultMatrix = multiplyMatrices(firstMatrix, secondMatrix);

        printMatrix(resultMatrix);

    }
}
