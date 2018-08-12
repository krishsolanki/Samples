package Errors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExcep {

	public static void main(String[] args) {

		boolean notInt = true;
		int x, y, sum;
		Scanner in = new Scanner(System.in);

		while(notInt == true) {
			try {

				System.out.println("Enter 1st number:");
				x = in.nextInt();

				System.out.println("Enter 2nd number:");
				y = in.nextInt();

				sum = x + y;

				System.out.println(sum);
				
				notInt = false;

			} catch (InputMismatchException e) {

				System.out.println("Ints only. Try again");

			}
		}
		

	}

}
