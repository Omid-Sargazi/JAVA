package projectnew;

public class project115 {
    public static void main(String[] args) {
        // System.out.pr!intln("Hello");
        double sum = 0.0;
        int p = 1;
        for (int x = 1; x <= 100; x++) {
            double k = 1;
            for (int y = 1; y <= x; y++) {
                k = k * 1.0 * y / x;
            }
            sum += k;
            if (x % 10 == 0)
                System.out.println(x + ":" + sum);
        }
        // System.out.println(sum);
    }
}
