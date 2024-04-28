package projectnew;

import java.util.Scanner; // Import the Scanner class

public class rotatelist {
    public static void main(String[] args) {
        System.out.println("RotateList");
        rotateList();
    }

    public static void rotateList() {
        System.out.println("Enter numbers");
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        System.out.println(n);
        int A[] = new int[n];
        int temp = 0;
        for (int x = 0; x < n; x++) {
            System.out.print("[ Enter items of list" + x + "]");
            A[x] = input.nextInt();
        }
        temp = A[n - 1];
        for (int x = n - 1; x > 0; x--) {
            A[x] = A[x - 1];
        }
        A[0] = temp;
        for (int x = 0; x < n; x++) {
            System.out.println("list of items are[" + "item:" + x + " is" + A[x] + "]");
        }
    }
}