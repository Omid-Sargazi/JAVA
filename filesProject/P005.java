package filesProject;

public class P005 {
    public static void main(String[] args) {
        String S = "omid0258";
        String reverse = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            reverse += S.charAt(i);
        }
        System.err.println(reverse);

    }
}
