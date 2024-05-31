package filesProject;

public class P003 {
    public static void main(String[] args) {
        String S = "OpenAi";
        int length = 0;

        char[] charArray = S.toCharArray();
        for (char ch : charArray) {
            length++;
        }
        System.err.println("Length is :" + length);
    }
}
