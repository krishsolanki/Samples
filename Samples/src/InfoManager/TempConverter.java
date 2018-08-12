package InfoManager;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {

		double c, f;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter celsius:");
		c = in.nextDouble();
		
		f = (9/5) * c + 32;
		
		System.out.println(f);
		
	}

}
