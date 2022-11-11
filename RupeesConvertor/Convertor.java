import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 if you have Dollars");
        System.out.println("Press 2 if you have Pounds");
        System.out.println("Press 3 if you have Euro");

        System.out.print("Enter your Choice: ");
        int user = sc.nextInt();

        if (user == 1) {
            System.out.print("Enter amount in dollars :");
            int dollar = sc.nextInt();
            System.out.println("Dollar to Inr: " + dollar * 81.26);
        } else if (user == 2) {
            System.out.print("Enter amount in Pounds :");
            int pounds = sc.nextInt();
            System.out.println("Pounds to Inr: " + pounds * 88.23);
        } else if (user == 3) {
            System.out.print("Enter amount in Euro :");
            int euro = sc.nextInt();
            System.out.println("Euro to Inr: " + euro * 78.74);
        }
    }

}