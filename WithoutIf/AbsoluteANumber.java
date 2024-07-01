package WithoutIf;

import java.util.Scanner;

public class AbsoluteANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number1");
        System.out.println("Enter a number2");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        // System.out.println(Math.abs(n));
        // System.out.println((int) Math.sqrt(n * n));

        // min(n1,n2) = ((|n1+n2|-|n1-n2|)/2)
        // min(n1,n2) = ((|n1+n2|+|n1-n2|)/2)

        int min = (Math.abs(n1 + n2) - Math.abs(n1 - n2)) / 2;
        int max = (Math.abs(n1 + n2) + Math.abs(n1 - n2)) / 2;
        System.out.println("Min : " + min + "Max :" + max);
    }
}
