package filesProject;

//StringUpperCase
public class P004 {
    public static void main(String[] args) {
        String str = "omidSargazi";
        char[] charArray = str.toCharArray();
        int indexI = 0;

        for (char ch : charArray) {
            if (ch >= 'a' && ch <= 'z') {
                charArray[indexI++] = (char) (ch - 'a' + 'A');
            } else if (ch >= 'A' && ch <= 'Z') {
                charArray[indexI++] = (char) (ch);

            }
        }

        System.err.print(charArray);

    }
}
