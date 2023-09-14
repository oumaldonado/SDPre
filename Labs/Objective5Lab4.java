import java.util.Scanner;

public class Objective5Lab4 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int userInput = input.nextInt();


		if (userInput % 2 == 0 ) {
			System.out.println("This number is even ");

		}else if (userInput % 2 == 1 ) {
			System.out.println("This number is odd");
		}
		input.close();



	}
}