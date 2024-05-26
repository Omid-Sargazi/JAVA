package StringProblems;

public class LeftTrim {
    public static void main(String[] args) {
        StrToInt();

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
        String S = "98aa754aaa111";
        int p = 0;
        String temp = "";

        for (int i = 0; i < S.length(); i++) {
            if ((S.charAt(i) - '0') >= 0 && (S.charAt(i) - '0') <= 9) {
                p = p * 10 + (S.charAt(i) - '0');
            } else {
                temp += S.charAt(i);
            }
        }
        System.out.println("StrToInt:  " + p);
        System.out.println("String is: " + temp);
    }
}
