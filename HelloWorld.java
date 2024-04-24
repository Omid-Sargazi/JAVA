import java.util.Scanner;

class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World");
        BaseTwo();
        BaseFour();
        BaseEight();
        TwoIntoTen();
        TwoBaseIntoEight();
        deleteZero();
        Integral();
        Factorial();
        Comofactorial();
    }

    public static void BaseTwo() {
        int a = 12;
        int s = 0;
        int p = 1;
        while (a > 0) {
            s = s + a % 2 * p;
            a = a / 2;
            p = p * 10;
        }
        System.out.println(s);
        System.out.println("///////////");

    }

    public static void BaseFour() {
        int n = 147;
        int p = 1;
        int s = 0;

        while (n > 0) {
            s = s + n % 4 * p;
            p = p * 10;
            n = n / 4;
        }
        System.out.println(s);

    }

    public static void BaseEight() {
        int n = 1478125478;
        int p = 1;
        int s = 0;

        while (n > 0) {
            s = s + n % 8 * p;
            n = n / 8;
            p = p * 10;
        }
        System.out.println("///////////");
        System.out.println(s);

    }

    public static void TwoIntoTen() {
        int n = 1110;
        int p = 1;
        int s = 0;
        while (n > 0) {
            s = s + n % 10 * p;
            n = n / 10;
            p = p * 2;
        }
        System.out.println("////////two into 10");
        System.out.println(s);
    }

    public static void TwoBaseIntoEight() {

        int n = 1110010111;
        int r = 0;
        int q = 0;
        int s = 0;
        int p = 1;

        while (n > 0) {

            r = n % 1000;
            q = r % 10 * 1 + (r / 10 % 10 * 2) + (r / 100 % 10 * 4);
            s = s + q * p;
            p = p * 10;
            n = n / 1000;
        }

        System.out.println("////////two into 8");
        System.out.println(s);
    }

    public static void deleteZero() {

        int n = 50104017;
        int res = 0;
        int p = 1;
        int r = 0;

        while (n > 0) {
            r = n % 10;
            if (r != 0) {
                res = res + n % 10 * p;
                p = p * 10;
            }
            n = n / 10;
        }

        System.out.println("////////two into 8");
        System.out.println(res);
    }

    public static void Integral() {
        double dt = 0.00001;
        double s = 0;
        for (double i = 1.0; i < 5.0; i = i + dt) {
            s = s + dt * (1 / i);
        }
        System.out.println("////////Calculate integral 1/ln(x)///////");
        System.out.println(s);
    }

    public static void Factorial() {
        int q = 3;
        int p = 1;
        for (int i = 1; i <= q; i++) {
            p = p * i;
        }
        System.out.println("/////////Factorial////");
        System.out.println(p);
    }

    public static void Comofactorial() {
        int a = 6;
        int b = 5;
        int p1 = 1;
        int p2 = 1;
        int p3 = 1;
        int p = 0;
        // a!
        for (int i = 1; i <= a; i++) {
            p1 = i * p1;
        }
        System.out.println(p1);

        // b!
        for (int i = 1; i <= b; i++) {
            p2 = i * p2;
        }
        for (int i = 1; i <= a - b; i++) {
            p3 = p3 * i;
        }
        // a!/(b!*(b!-a!))
        p = p1 / (p2 * p3);

        System.out.println("////////composition");
        System.out.println(p);

    }
}
