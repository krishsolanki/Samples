package InfoManager;

import java.util.Random;
import java.util.Scanner;

public class Randomiser {

	public static void main(String[] args) {
		int x, guess;	
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		x = r.nextInt(100);		
		System.out.println("Guess between 0-100");
			
		while (true) {
			guess = input.nextInt();
			if(guess > x) {
				System.out.println("Too high!");
			} else if (guess < x) {
				System.out.println("Too low!");
			} else if (guess == x) {
				System.out.println("CORRECT!!");
				break;	
		}
	}
}
}
