package string;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            char c = (char) i;
            System.out.println("" + i + ":" + c);
        }
    }
}