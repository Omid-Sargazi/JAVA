import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInt a = new BigInt();
        BigInt b = new BigInt();
        BigInt c = new BigInt();
        // System.out.println("Hello");
        // BigInt x = new BigInt("12");
        // BigInt y = new BigInt("13");
        // BigInt z = new BigInt();
        // z.setSum(x, y);
        // // y.Set("15935755");
        // BigInt p = new BigInt();
        // p.setSum("159", "357");
        // p.setSum(x, "357");
        // p.setSum("1598", y);
        // System.out.println(x.Get());
        // System.out.println(y.Get());
        // System.out.println(z.Get());
        // System.out.println(p.Get());
        System.out.println("enetr number 1: ");
        a.Set(input.nextLine());

        System.out.println(("enter operator(+,*,/,-)"));
        String op = input.nextLine();

        System.out.println("enter number 2: ");
        b.Set(input.nextLine());
        c.setSum(a, b);

        System.out.println(c.Get());

    }
}
