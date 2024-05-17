package string;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomCredentialsGenerator {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final int USERNAME_LENGTH = 8;
    private static final int PASSWORD_LENGTH = 12;

    public static void main(String[] args) {
        String username = generateRandomString(USERNAME_LENGTH, CHARACTERS);
        String password = generateRandomString(PASSWORD_LENGTH, CHARACTERS + NUMBERS);

        System.out.println("Generated Username: " + username);
        System.out.println("Generated Password: " + password);

        saveToFile(username, password);
    }

    private static String generateRandomString(int length, String characters) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    private static void saveToFile(String username, String password) {
        try (FileWriter fileWriter = new FileWriter("credentials.txt", true)) {
            fileWriter.write("Username: " + username + "\n");
            fileWriter.write("Password: " + password + "\n");
            fileWriter.write("------------------------------\n");
            System.out.println("Credentials saved to file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
