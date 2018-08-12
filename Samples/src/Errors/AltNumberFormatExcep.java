package Errors;

import java.util.Scanner;

public class AltNumberFormatExcep {

	public static void main(String[] args) {

		int x, y, operator, result = 0;
		Scanner in = new Scanner(System.in);
			
			System.out.println("Enter first number");
			x = Integer.parseInt(in.nextLine());
			System.out.println("Enter second number");
			y = Integer.parseInt(in.nextLine());
			System.out.println("Pick operator (1 for add, 2 for substract, "
					+ "3 for divide, 4 for multiplication)");
			operator = Integer.parseInt(in.nextLine());;
			
			switch(operator) {
				case 1: result = x + y;
						break;
				case 2: result = x - y;
						break;
				case 3: result = x / y;
						break;
				case 4: result = x * y;
						break;
			}
			
			System.out.println(result);
		
	}

}
