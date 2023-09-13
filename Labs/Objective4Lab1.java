import java.util.Scanner;

public class Objective4Lab1 {
	public static void main (String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String fname = "What's your first name? ";
		System.out.println(fname);
		String userfName = keyboard.nextLine();

		String lname = "What's your last name? ";
		System.out.println(lname);
		String userlName = keyboard.nextLine();

		String favoriteAnimal = "What's your favorite animal? ";
		System.out.println(favoriteAnimal);
		String userFavoriteAnimal = keyboard.nextLine();

		String favoriteFood = "What's your favorite food? ";
		System.out.println(favoriteFood);
		String userFavoriteFood = keyboard.nextLine();

		String favoriteSong = "whats your favorite song? ";
		System.out.println(favoriteSong);
		String userFavoriteSong = keyboard.nextLine();

		System.out.println("My name is " + userfName + " "+ userlName+ ".");
		System.out.println("My favorite animal is " + userFavoriteAnimal);
		System.out.println("My favorite food is " + userFavoriteFood);
		System.out.println("My favorite song is " + userFavoriteSong);

		



	}
}