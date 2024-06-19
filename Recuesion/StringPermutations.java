package Recuesion;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static void main(String[] args) {
        System.out.println(permutations("omid"));
    }

    public static List<String> permutations(String str) {
        List<String> result = new ArrayList<>();
        if (str.length() == 0) {
            result.add("");
            return result;
        }
        char first = str.charAt(0);
        String remaining = str.substring(1);
        List<String> words = permutations(remaining);
        result.add(remaining);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                result.add(word.substring(0, i) + first + word.substring(i));
            }
        }
        // System.out.println(words);
        return result;
    }

}
