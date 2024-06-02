package filesProject;

public class StringOfProblems02 {
    public static void main(String[] args) {
        FindSubstring();
        ReplaceCharacter();
        // System.out.println("End of program");
    }

    public static void FindSubstring() {
        String s1 = "Hwello world";
        String s2 = "world";
        for (int i = 0; i < s1.length(); i++) {
            int flag = 1;
            for (int j = 0; j < s2.length(); j++) {
                if (s2.charAt(j) != s1.charAt(i + j)) {
                    flag = 0;

                    break;
                }

            }
            if (flag == 1) {
                System.out.println("start: " + i);
            }
        }
    }

    public static void ReplaceCharacter() {
        String s = "Saleh";
        char oldCahr = 'a';
        char newChar = 'o';
        String result = "";

        for (char ch : s.toCharArray()) {
            if (ch != oldCahr) {
                result = result + ch;
            } else {
                result = result + 'o';
            }
        }
        System.out.println(result);

    }
}
