package StringProblems;

public class LeftTrim {
    public static void main(String[] args) {
        StrToInt();
        StrToDouble();

        String S = "   x    ";
        int i1 = 0;
        int i2 = S.length() - 1;

        while (i1 < S.length() && S.charAt(i1) == ' ')
            i1++;
        while (i2 > i1 && S.charAt(i2) == ' ')
            i2--;

        String R = "";
        for (int i = i1; i <= i2; i++) {
            R = R + S.charAt(i);
        }

        // System.out.println(R + "R" + R.length());
        // System.out.println(S + "S");
    }

    public static void StrToInt() {
        String S = "98Sa754Omid111Sargazi";
        int p = 0;
        String temp = "";

        for (int i = 0; i < S.length(); i++) {
            if ((S.charAt(i) - '0') >= 0 && (S.charAt(i) - '0') <= 9) {
                p = p * 10 + (S.charAt(i) - '0');
            } else {
                temp += S.charAt(i);
            }
        }
        // System.out.println("StrToInt: " + p);
        // System.out.println("String is: " + temp);
    }

    public static void StrToDouble() {
        String s = "-.00004";
        double d = 0.0;
        int sign = 1;
        boolean hasFraction = false;
        double fractionDivisor = 1.0;

        int startIndex = 0;
        if (s.charAt(0) == '-') {
            startIndex = 1;
            sign = -1;
        } else if (s.charAt(0) == '+') {
            startIndex = 1;
        }

        for (int i = startIndex; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '.') {
                hasFraction = true;
                continue;
            }
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("Invalid character in input string: " + c);
            }

            if (hasFraction) {
                fractionDivisor *= 10;
                d = d + (c - '0') / fractionDivisor;

            } else {
                d = d * 10 + (c - '0');
            }

        }
        System.out.print("result is: " + d * sign);
        System.out.print("result +2 is: " + (d * sign + 2));
    }
}
