package filesProject;

public class StringOfProblems02 {
    public static void main(String[] args) {
        FindSubstring();
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
}
