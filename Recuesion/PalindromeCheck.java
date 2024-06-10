package Recuesion;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(palindromeCheck("omiddimo"));
    }

    public static boolean palindromeCheck(String S) {
        int l = S.length();
        if (S.length() <= 1)
            return true;
        if (S.charAt(0) != S.charAt(S.length() - 1))
            return false;
        return palindromeCheck(S.substring(1, S.length() - 1));
    }
}
