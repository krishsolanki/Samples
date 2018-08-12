package Arrays;

import java.util.Random;

public class ArrayAverage {
	
	public static int average(int[] array) {
		int sum = 0;
		int average;
		
		for(int i : array) {
			sum += i;
		}
		
		average = sum / array.length;
		
		return average;
	}
	
	public static double doubleAverage(int[] array) {
		double sum = 0;
		double average;
		
		for(int i : array) {
			sum += i;
		}
		
		average = sum / array.length;
		
		return average;
	}

	public static void main(String[] args) {
		int size = 4;
		int array[] = new int[size];
		
		Random r = new Random();
		
		for(int i = 0; i < size; i++) {
			array[i] = r.nextInt(100);
		}
		
		for(int rand : array) {
			System.out.print(rand + " ");
		}
		
		System.out.println("\nAverage: " + average(array));
		System.out.println("\nDouble Average: " + doubleAverage(array));

	}

}
