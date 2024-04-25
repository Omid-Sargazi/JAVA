package projectnew;

import javax.swing.*;

import java.util.Scanner;

public class pexercise {
    public static void main(String[] args) {
        // double p = 0.0;
        // float a = -1;
        // int x = 3;
        // p = -1;
        // int ai = 1;
        // double s = 3.0;
        // while (p > 0.00000001) {
        // p = 1;
        // if (ai % 3 == 0)
        // a = -a;
        // ai++;
        // // p = 1;
        // for (int y = 1; y <= x; y++) {
        // p = (1.0 * y / x) * p;
        // s = s + p * a;
        // x = x + 2;
        // }
        // }
        // System.out.println(s);

        // System.out.println("Hello");
        // fact();
        // multiple();
        divided();
        sswing();
    }

    public static int fact() {
        Scanner input = new Scanner(System.in);
        int n;
        int p = 1;
        System.out.println("Enter a number");
        n = input.nextInt();
        for (int x = 1; x <= n; x++) {
            p = p * x;
        }
        System.out.println(p);
        return n;
    }

    public static void multiple() {
        Scanner input = new Scanner(System.in);
        int n;
        int p = 1;
        System.out.println("enter a number");
        n = input.nextInt();
        for (int x = 1; x <= n; x++) {
            p = n * p;
        }
        System.out.println(p);
    }

    public static void divided() {
        float p = 0;
        float s = 0;
        int x = 3;
        int fact = 1;
        int m = 1;
        while (p < 0.1) {
            for (int i = 1; i <= x; i++) {
                fact = fact * i;
                m *= x;
                System.out.println(i);

            }
            p = (float) (s + (1.0 * (fact / m)));
            x += 2;
            fact = 1;
            m = 1;
        }
        System.out.println(p);
        // System.out.println("fact//////////");
    }

    public static void sswing() {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Click Here");
        b.setBounds(50, 100, 95, 80);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
