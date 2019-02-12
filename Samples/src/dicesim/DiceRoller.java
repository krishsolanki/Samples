package dicesim;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {


	int result, diceSides, con, noOfDie;
	Random randomGen = new Random();
	boolean keepRolling = true;
	Scanner input = new Scanner(System.in);


	void rollDice(){

		System.out.println("How many sides?");
		diceSides = input.nextInt();

		System.out.println("How many die to throw?");
		noOfDie = input.nextInt();

		if(noOfDie == 1) {
			result = randomGen.nextInt(diceSides) + 1;
			System.out.println(result);
		} else {
			rollDice(diceSides, noOfDie);
		}
	}

	void rollDice(int s, int n){
		int diceRolls[] = new int[n]; 
		int sum = 0;
		for (int x = 0; x < n; x++) {
			result = randomGen.nextInt(s) + 1;
			diceRolls[x] = result;
		}
		
		for (int x: diceRolls) {
			System.out.print(x + " ");
			sum += x;
		}
		
		System.out.println("sum: " + sum );
	}

	public static void main(String[] args) {

		DiceRoller dR = new DiceRoller();


		while (dR.keepRolling) {

			dR.rollDice();

			System.out.println("Continue rolling? 1 for yes, 2 for no.");
			dR.con = dR.input.nextInt();
			dR.keepRolling = dR.con == 1 ? true : false;

		}

		System.out.println("Thanks for playing.");

	}

}
