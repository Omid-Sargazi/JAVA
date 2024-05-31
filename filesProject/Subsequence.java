package filesProject;

//Subsequence means whether is there sequence in the words; 
public class Subsequence {
    public static void main(String[] args) {
        System.out.println("Subsequence");
        String S1 = "omid";
        String S2 = "soaamid";
        int i = 0;
        int j = 0;
        while (i < S1.length() && j < S2.length()) {
            if (S1.charAt(i) == S2.charAt(j))
                i++;
            j++;
        }
        boolean isSubSequence = i == S1.length();
        System.out.println(isSubSequence);
    }
}
