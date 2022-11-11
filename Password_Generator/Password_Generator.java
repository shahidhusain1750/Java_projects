import java.util.Random;

public class Password_Generator {

    public static void main(String[] args) {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCAse = "abcdefghijklmnopqrstuvwxyz";
        String number = "1234567890";
        String specialChar = "<>,.?/}]+_-!@#$%^&*";
        String combination = upperCase + lowerCAse + specialChar + number;
        int len = 8;
        char[] pasword = new char[len];
        Random r = new Random();

        for (int i = 0; i < len; i++) {
            pasword[i] = combination.charAt(r.nextInt(combination.length()));
        }

        System.out.println("Generat password is " + new String(pasword));

    }
}