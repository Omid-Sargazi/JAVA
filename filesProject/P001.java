package filesProject;

public class P001 {
    public static void main(String[] args) {
        concatTwoString();
        LengthString();
        StringUpperCase();

    }

    public static void concatTwoString() {
        String s1 = "hello";
        String s2 = "world";

        String result = s1.concat(";" + s2);
        System.out.print(result);
    }

    public static void LengthString() {
        String S = "hello world from omid";

        System.out.println("S is: " + S + " " + S.length());
    }

    public static void StringUpperCase() {
        String str = "omid@#$";
        String upercaseStr = str.toUpperCase();
        System.out.println(upercaseStr);
    }
}
