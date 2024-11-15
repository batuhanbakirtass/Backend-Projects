import java.util.Scanner;

public class GradeAverageCalculator {
    public static void main(String[] args) {
        // Variables for subjects
        int math, physics, chemistry, turkish, history, music;

        // Initializing the Scanner class for user input
        Scanner inp = new Scanner(System.in);

        // Getting user input for each subject grade
        System.out.print("Enter your Math grade: ");
        math = inp.nextInt();

        System.out.print("Enter your Physics grade: ");
        physics = inp.nextInt();

        System.out.print("Enter your Chemistry grade: ");
        chemistry = inp.nextInt();

        System.out.print("Enter your Turkish grade: ");
        turkish = inp.nextInt();

        System.out.print("Enter your History grade: ");
        history = inp.nextInt();

        System.out.print("Enter your Music grade: ");
        music = inp.nextInt();

        // Calculating the total and average grades
        int total = math + physics + chemistry + turkish + history + music;
        double average = total / 6.0;
        System.out.println("Your average grade: " + average);

        // Using Ternary Operator to determine pass/fail status
        String status = (average >= 60) ? "Passed" : "Failed";
        System.out.println("Status: " + status);

        // Closing the Scanner (optional)
        inp.close();
    }
}
