package gLib.filesProject;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> studentGrade = new HashMap<>();

        studentGrade.put("Omid", "A");
        studentGrade.put("Saeed", "B");
        studentGrade.put("Vahid", "C");
        studentGrade.put("Miki", "D");

        System.out.println("omid is a gride: " + studentGrade.get("Omid"));
        System.out.println("Saeed is a gride: " + studentGrade.get("Saeed"));
        System.out.println("Vahid is a gride: " + studentGrade.get("Vahid"));
        System.out.println("Miki is a gride: " + studentGrade.get("Miki"));

        String student = "Eva";

        if (studentGrade.containsKey(student)) {
            System.out.println(student + "'s grade: " + studentGrade.get(student));
        } else {
            System.out.println(student + " is not in the grade list.");
        }

        System.out.println("All Students grades:  ");
        for (String key : studentGrade.keySet()) {
            System.out.println(key + ": " + studentGrade.get(key));
        }
    }
}
