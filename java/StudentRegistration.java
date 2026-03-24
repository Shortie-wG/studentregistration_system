// StudentRegistration.java
import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter number of registered units: ");
        int units = input.nextInt();

        String status;

        if (units > 7) {
            status = "Overload - Approval Required";
        } else {
            status = "Registration Accepted";
        }

        System.out.println("\n--- REGISTRATION SUMMARY ---");
        System.out.println("Student Name: " + name);
        System.out.println("Units: " + units);
        System.out.println("Status: " + status);

        input.close();
    }
}