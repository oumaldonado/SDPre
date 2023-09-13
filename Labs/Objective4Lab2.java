import java.util.Scanner;

public class Objective4Lab2 {
	public static void main (String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the first whole number you would like to add.");
		int num1 = keyboard.nextInt();
		System.out.println("Please enter the first decimal number your would like to add.");
		double dnum1 = keyboard.nextDouble();

		System.out.println("Please enter the second whole number you would like to add.");
		int num2 = keyboard.nextInt();
		System.out.println("Please enter the second decimal number you would like to add.");
		double dnum2 = keyboard.nextDouble();

		System.out.println("Please enter the third whole number you would like to add.");
		int num3 = keyboard.nextInt();
		System.out.println("Please enter the third decimal number your would like to add.");
		double dnum3 = keyboard.nextDouble();


		int answer = num1 + num2 + num3;
		double dAnswer = dnum1 + dnum2 + dnum3;

		System.out.println("The sum of "+ num1 + " + " + num2 + " + " + num3 + " = " + answer);
		System.out.println("The sum of "+ dnum1 + " + " + dnum2 + " + " + dnum3 + " = " + dAnswer);


	}
}