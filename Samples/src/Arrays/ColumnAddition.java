package Arrays;

import java.util.Random;

public class ColumnAddition {

	public static int sumColumn(int[][] array, int columnIndex) {

		int sum = 0;
		int x;
		
		for(int i = 0 ; i < array.length; i++) {
			x = array[i][columnIndex];
			sum += x;
		}

		return sum;
	}

	public static void main(String[] args) {

		int rows = 2;
		int columns = 3;
		int[][] multi = new int[rows][columns];
		Random r = new Random();

		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				multi[i][j] = r.nextInt(50);
			}
		}

		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < multi[i].length; j++) {
				System.out.print(multi[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println(sumColumn(multi, 1));
	}
}
