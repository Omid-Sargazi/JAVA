package WithoutIf.ProblemsWIthJava;

import java.util.Scanner;

public class Lowestcommonmultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int n1 = input.nextInt();
        System.out.println("Enter second number");
        int n2 = input.nextInt();

        if (n1 < n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        System.out.println(n1 + ", " + n2);

        // n1>=n2

        for (int x = n2; x >= 1; x--) {
            if (n2 % x == 0 && n1 % x == 0) {
                System.out.println(x);
                break;
            }
        }

    }
}
