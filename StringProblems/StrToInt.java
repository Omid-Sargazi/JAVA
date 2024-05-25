package StringProblems;
// We have number in string. we feel like changing into number;

public class StrToInt {
    public static void main(String[] args) {
        String S = "36548";
        int p = 0;
        for (int i = 0; i < S.length(); i++) {
            p = p * 10 + S.charAt(i) - '0';
        }
        p = p * 2;
        System.out.println(p + "  Hello");
    }
}
