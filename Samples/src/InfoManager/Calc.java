package InfoManager;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

		int x, y, z;
		float end;
		Scanner in = new Scanner(System.in); 
		
		System.out.println("You must enter 3 numbers. One at a time.");
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		end = (float)(x * y) / z;
		
		System.out.println(end);
		
	}

}
