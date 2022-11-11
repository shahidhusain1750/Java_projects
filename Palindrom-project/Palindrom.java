import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = sc.next(), reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String." + "\n" +
                    "length of string is" + "\n" +
                    str.length());
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }

}