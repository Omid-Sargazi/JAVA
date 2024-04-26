package projectnew;

import java.util.Scanner;

public class project61 {
    public static void main(String[] args) {
        System.out.println("Hello");
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enetr a number");
        // n = input.nextInt();
        long a = 1;
        long b = 1;
        long c = 0;
        int count = 0;
        int count0 = 0;
        while (count < 20) {
            c = a + b;
            int s = 0;
            // System.out.println(c);
            for (int i = 2; i < Math.sqrt(c); i++)
                if (c % i == 0)
                    s++;
            if (s == 0)
                System.out.println(count++ + ":" + c);
            a = b;
            b = c;
            count0++;
            System.out.println(count0 + "<== this is fibonacci series");

        }

    }// end of main
}// end of class
