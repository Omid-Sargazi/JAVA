package filesProject;

public class StringOfProblems {
    public static void main(String[] args) {
        Concatenation();
        LengthCalculation();
        CharacterExtraction();
        StringComparison();
        ConverttoLowercase();
        ConvertUppercase();
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
}
