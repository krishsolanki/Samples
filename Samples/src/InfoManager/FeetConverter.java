package InfoManager;

import java.util.Scanner;

public class FeetConverter {

	public static void main(String[] args) {

		double feet, meter;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter feet in decimals:");
		feet = in.nextDouble();
		
		meter = feet * 0.305;
		
		System.out.println(meter);
	}

}
