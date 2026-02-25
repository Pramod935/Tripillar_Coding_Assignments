package Module1;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's marks (0-100): ");
        int marks = scanner.nextInt();

        int category = marks / 10;

        switch (category) {
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                if (marks >= 0 && marks < 60)
                    System.out.println("Grade: F");
                else
                    System.out.println("Invalid marks entered.");
        }

        scanner.close();
    }
}
