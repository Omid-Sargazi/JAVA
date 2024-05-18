package string;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A number between 1 and 365:  ");
        int n = input.nextInt();
        if (n >= 1 && n < 186) {
            if (n % 31 == 0) {
                System.out.println("Month Number is:  " + ((n / 31)));
                System.out.println("Month Number is:  " + 31);

            } else {
                System.out.println("Month Number is:  " + ((n / 31) + 1));
                System.out.println("Day of month is: " + n % 31);
            }
        } else if (n >= 186 && n <= 336) {
            int m = n - 186;
            if (m % 30 == 0) {
                System.out.println("Month Number is:  " + (m / 30 + 6));
                System.out.println("Month Number is:  " + (30));

            } else {

                System.out.println("Month Number is:  " + (m / 30 + 7));
                System.out.println("Day Number is: " + m % 30);
            }
        } else if (n >= 336 && n <= 366) {
            System.out.println("Month Number is:  " + 12);
            System.out.println("Day Number is: " + ((n - 336)));
        } else {
            System.out.println("Enter a correct month number");
        }

    }
}
