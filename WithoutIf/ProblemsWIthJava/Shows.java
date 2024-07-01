package WithoutIf.ProblemsWIthJava;

import java.util.Scanner;

public class Shows {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i = i + 2) {

            sum += i;

        }
        System.out.print(sum + " ");
    }
}
