package filesProject;

public class StringOfProblems {
    public static void main(String[] args) {
        // Concatenation();
        // LengthCalculation();
        // CharacterExtraction();
        // StringComparison();
        // ConverttoLowercase();
        // ConvertUppercase();
        ReversString();
        Palindrome();
        CountVowelsConsonants();

        // charAtAll();
        System.out.println("String");
    }

    public static void Concatenation() {
        String s1 = "hello";
        String s2 = "world";
        String result = s1 + "" + s2;
        System.out.println(result);
    }

    public static void LengthCalculation() {
        String s = "helloworld!!!";
        int i = 0;
        for (char ch : s.toCharArray()) {
            i++;
        }
        System.out.println("Length is: " + s + "," + i);
    }

    public static void CharacterExtraction() {
        String S = "Hello";
        for (char ch : S.toCharArray()) {
            System.out.println(ch);
        }
        for (int i = 0; i < S.length(); i++) {
            System.out.println(S.charAt(i) + " For loop");
            ;
        }
    }

    public static void StringComparison() {
        String s1 = "Hello";
        String s2 = "hello";
        boolean areEqaul = true;
        if (s1.length() != s2.length()) {
            areEqaul = false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    areEqaul = false;
                    break;
                }

            }
        }
        System.out.println("Strings are equals:  " + areEqaul);
    }

    public static void charAtAll() {
        String s = "";
        for (char i = ' '; i < 274; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 274; i++) {
            System.out.println(i + " " + (char) (i));
        }
    }

    public static void ConverttoLowercase() {
        String S = "helloWorld";
        String result = "";

        for (char ch : S.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                result = result + ch;
                // System.out.println((ch));
            } else {
                result = result + (char) (ch + 32);
                // System.out.println((char) (ch + 32));
            }
        }
        System.out.println(result + "       ConverttoLowercase");
    }

    public static void ConvertUppercase() {
        String s = "helloWorld";
        String result = "";

        for (char ch : s.toCharArray()) {
            if (ch > 'a' && ch < 'z') {
                result = result + (char) (ch - 32);
            } else {
                result = result + ch;
            }
        }
        System.out.println(result + "   Uppercase");
    }

    public static void ReversString() {
        String S = "Omid";
        String result = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            result += S.charAt(i);
        }
        System.out.println(result);
    }

    public static void Palindrome() {
        boolean isPalindrome = true;
        String S = "omi!!imo";
        int n = S.length();
        for (int i = 0; i < n / 2; i++) {
            if (S.charAt(i) != S.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }

    public static void CountVowelsConsonants() {
        // a,e,u,i,o
        String s = "ooomid";
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'u' || ch == 'i' || ch == 'o' || ch == 'A' || ch == 'U' || ch == 'O'
                    || ch == 'E') {
                count++;
            }
        }
        System.out.println(count);
    }
}
