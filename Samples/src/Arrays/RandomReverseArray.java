package Arrays;

import java.util.Random;

public class RandomReverseArray {

	public static void main(String[] args) {
		int size = 10;
		int array[] = new int[size];
		
		Random r = new Random();
		
		for(int i = 0; i < size; i++) {
			array[i] = r.nextInt(100);
		}
		
		for(int rand : array) {
			System.out.print(rand + " ");
		}
		
		System.out.println("\nReverse: ");
		
		for(int j = size - 1; j >= 0; j--) {
			System.out.print(array[j] + " ");
		}
	}

}
