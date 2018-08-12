package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

import Students.Student;

public class InputArray {

	public static void main(String[] args) {
		
		int maxIndex = 0;
		int minIndex = 0;
		boolean isZero = false;
		ArrayList<Integer> array = new ArrayList<Integer>(); 
		
		Scanner in = new Scanner(System.in);
				
		while(isZero == false) {
			
			System.out.println("Enter Number: ");
			int element = in.nextInt();
			
			if(element != 0) {
				array.add(element);
			} else if (element == 0) {
				isZero = true;
			}
			
		}
		
		for(int i : array) {
			System.out.print(i + " " + "\n");
		}
		
		for (int compare : array) {
			if (compare > array.get(maxIndex)) {
				maxIndex = array.indexOf(compare);
			}
		}
		
		for ( int compare : array) {
			if (array.get(minIndex) > compare) {
				minIndex = array.indexOf(compare);
			}
		}
		
		
		System.out.println("\nBiggest: " + array.get(maxIndex));
		System.out.println("Smallest: " + array.get(minIndex));
		
	}

}
