package InfoManager;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Averages {
	
	public static int getUserNumber() {
		int x = 1;		
		Scanner in = new Scanner(System.in);

		x = in.nextInt();
		return x;
		
	}
		
	
	public static int sum(ArrayList<Integer> array) {
		
		int total = 0;
		
		for (int i : array) {
			total += i;
		}
		
		return total;
	}
	
	public static int average(ArrayList<Integer> array) {
		int total = sum(array);
		return total / array.size();
	}
	
	public static String counter (ArrayList<Integer> array) {
		
		int posCounter = 0;
		int negCounter = 0;
		
		for (int j : array) {
			if(j > 0) {
					posCounter++;
			} else if (j < 0) {
					negCounter++;
			}
		}
		
		return "Positive: " + posCounter + "\nNegative: " + negCounter;
		
	}

	public static void main(String[] args) {
				
		int y = 1;
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter numbers. Enter 0 to stop:");
			
	
		while (true) {			
			
			while(true) {
				try{
					y = getUserNumber();
					break;
				} catch (InputMismatchException e) {
					System.out.println("again");
				}
			}
			
			if (y != 0) {
				list.add(y);
			} else if (y == 0) {
				break;
			}
			
		}
		
		
	
		System.out.println(list.toString());
		System.out.println(counter(list));
		System.out.println("Total sum: " + sum(list));
		System.out.println("The size is: " + list.size());
		System.out.println("The average is: " + average(list));
		
	}

}
