import java.util.ArrayList;
import java.util.Scanner;

public class Iterate {
    public static void main(String[] args) {
        // Array Initialize Student and Teacher
        ArrayList<String> student = new ArrayList<>();
        ArrayList<String> teacher = new ArrayList<>();
        // Scanner Initialization
        Scanner sc = new Scanner(System.in);
        // Size of the Array
        System.out.print("Enter Size of the array: ");
        int a = sc.nextInt();

        for (int i = 0; i <= a; i++) {
            String data1 = sc.nextLine();
            // Inserting data into ArrayList
            student.add(i, data1);
        }
        System.out.println(student);

        for (int i = 0; i <= a; i++) {
            String data2 = sc.nextLine();
            // Inserting data into ArrayList
            teacher.add(i, data2);
        }
        System.out.println(teacher);

        System.out.println("Press 1 to display Student Data");
        System.out.println("Press 2 to display Teachers Data");

        System.out.print("Enter your Choice: ");
        int user = sc.nextInt();

        if (user == 1) {
            for (int i = 0; i < student.size(); i++) {
                System.out.println("Student Data: " + student.get(i));
            }
        } else if (user == 2) {
            for (int j = 0; j < teacher.size(); j++) {
                System.out.println("Teachers Data: " + teacher.get(j));
            }
        }
    }
}