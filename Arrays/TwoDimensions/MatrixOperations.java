package Arrays.TwoDimensions;

public class MatrixOperations {
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }

    public static void printMainMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(", ");
        }
    }

    public static void printMainDiagonal(int[][] matrix) {
        System.out.println("Main Diagonal");
        for (int i = 0; i < Math.min(matrix.length, matrix[0].length); i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    public static void printNthRow(int[][] matrix, int n) {
        System.out.println("Row" + n + ": ");
        for (int j = 0; j < matrix[n].length; j++) {
            System.out.print(matrix[n][j] + " ");
        }
        System.out.println("");
    }

    public static void swapRowWithColumn(int[][] matrix, int n) {
        System.out.println("Swapping row " + n + " with column " + n);
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[n][i];
            matrix[n][i] = matrix[i][n];
            matrix[i][n] = temp;
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }

    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] matrix = createMatrix(rows, cols);
        printMainDiagonal(matrix);
        printMainMatrix(matrix);
        System.out.println("Row");
        printNthRow(matrix, 2);
    }
}
