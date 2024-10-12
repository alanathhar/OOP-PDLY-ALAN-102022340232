package projecttest;
import java.util.Scanner;
public class yyy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Name:");
		String name = scanner.nextLine();
		
		System.out.print("NIM: ");
		int NIM = scanner.nextInt();
		
		System.out.print("Input the Assignment Grade: ");
		int Assign = scanner.nextInt();
		
		System.out.print("Input the Quiz Grade: ");
		int Quiz = scanner.nextInt();
		
		System.out.print("Input the Mid-Term Exam Grade: ");
		int Midterm = scanner.nextInt();
		
		System.out.print("Input the Final Exam Grade: ");
		int Final = scanner.nextInt();
		
		System.out.print("Input the Final Project Grade: ");
		int Project = scanner.nextInt();
		
		int total = ((30 * Project / 100)+(10 * Quiz / 100)+
				(10 * Assign / 100)+(25 * Midterm / 100)+(25 * Final / 100 ));
		
		System.out.println("");
		System.out.println("Name: " +name);
		System.out.println("NIM: "+NIM);
		System.out.println("Total Grade: "+total);
	}

	private static void clear() {
		// TODO Auto-generated method stub
		
	}

}