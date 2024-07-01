package WithoutIf.ProblemsWIthJava;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

    }
}
