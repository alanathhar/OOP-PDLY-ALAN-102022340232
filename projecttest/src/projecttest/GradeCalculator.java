package projecttest;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter your NIM: ");
        int studentNIM = scanner.nextInt();

        int assignmentGrade = getGrade(scanner, "Assignment");
        int quizGrade = getGrade(scanner, "Quiz");
        int midtermGrade = getGrade(scanner, "Mid-Term Exam");
        int finalExamGrade = getGrade(scanner, "Final Exam");
        int projectGrade = getGrade(scanner, "Final Project");

        int totalGrade = calculateTotalGrade(assignmentGrade, quizGrade, midtermGrade, finalExamGrade, projectGrade);

        System.out.println("\n--- Student Grade Report ---");
        System.out.println("Name: " + studentName);
        System.out.println("NIM: " + studentNIM);
        System.out.println("Total Grade: " + totalGrade);
    }

    private static int getGrade(Scanner scanner, String gradeType) {
        System.out.print("Input the " + gradeType + " Grade: ");
        int grade = scanner.nextInt();
        while (grade < 0 || grade > 100) {
            System.out.print("Invalid input. Please enter a grade between 0 and 100: ");
            grade = scanner.nextInt();
        }
        return grade;
    }

    private static int calculateTotalGrade(int assignment, int quiz, int midterm, int finalExam, int project) {
        return (int) ((0.10 * assignment) + (0.10 * quiz) + (0.25 * midterm) + (0.25 * finalExam) + (0.30 * project));
    }
}
