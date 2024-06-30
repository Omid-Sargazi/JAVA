package Arrays.TwoDimensions;

public class Array1 {
    public static void main(String[] args) {
        Array();
        System.out.println("Array");

    }

    public static void Array() {
        int rows = 4;
        int cols = 5;
        int A[][] = new int[rows][cols];

        System.out.print("[");

        for (int x = 0; x < rows; x++) {

            for (int y = 0; y < cols; y++) {
                A[x][y] = x * y;
                System.out.print(A[x][y] + ", ");
            }

            System.out.println("");

            if (x == rows - 1) {
                System.out.print("]");
            }

        }
        System.out.println("");

    }
}
