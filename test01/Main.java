package test01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        prefossor p1 = new prefossor(10, "Saeed", "Sargazi", "1593575512", "JAVA");

        p1.setSkill("Python");
        p1.setActive(false);
        System.out.println(p1);
    }
}
