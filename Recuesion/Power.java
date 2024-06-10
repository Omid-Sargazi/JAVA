package Recuesion;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }

    public static int power(int b, int p) {
        if (p == 0)
            return 1;
        return b * power(b, p - 1);
    }
}
