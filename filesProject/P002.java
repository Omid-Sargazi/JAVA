package filesProject;

//ConcatenateStrings
public class P002 {
    public static void main(String[] args) {
        String S1 = "Hello";
        String S2 = "World";

        String result = customConcat(S1, S2);
        System.out.println(result);
    }

    public static String customConcat(String S1, String S2) {
        char[] resultArray = new char[S1.length() + S2.length()];
        int indexI = 0;

        for (int i = 0; i < S1.length(); i++) {
            resultArray[indexI++] = S1.charAt(i);
        }

        for (int i = 0; i < S2.length(); i++) {
            resultArray[indexI++] = S2.charAt(i);
        }
        for (int i = 0; i < S1.length() + S2.length(); i++) {

            System.out.println(resultArray[i] + "");
        }
        return new String(resultArray);
    }
}
