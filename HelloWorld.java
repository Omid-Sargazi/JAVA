import java.util.Scanner;

class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World");
        BaseTwo();
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
    }

}
