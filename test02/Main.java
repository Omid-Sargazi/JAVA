package test02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        professor p1 = new professor(1100, "omid", "sargazi", "152", "Java");
        p1.setSkill("Javascript");
        p1.setActive(false);
        System.out.println(p1);
        p1.setActive(true);
        System.out.println(p1);
    }

}
