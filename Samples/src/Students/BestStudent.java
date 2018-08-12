package Students;

import java.util.ArrayList;
import java.util.Scanner;

public class BestStudent {

	public static void main(String[] args) {

		int maxIndex = 0;
		int subIndex = 0;
		int x = 1;
		Scanner input = new Scanner(System.in);

		ArrayList<Student> students = new ArrayList<>();

		System.out.println("How many students?");
		x = input.nextInt();
		input.nextLine();

		for(int i = 0; i < x; i++) {

			String name = null;
			int score = 0;

			System.out.println("enter name");
			name = input.nextLine();


			System.out.println("enter score");
			score = input.nextInt();
			input.nextLine();

			Student student = new Student(name, score);

			students.add(student);
		}


		System.out.println(students.toString());

		for (Student compare : students) {

			if(compare.getScore() > students.get(maxIndex).getScore()) {
				maxIndex = students.indexOf(compare);
			}
			
			if(compare.getScore() > students.get(maxIndex).getScore() && 
					maxIndex != students.indexOf(compare)) {
				subIndex = students.indexOf(compare);
			}

		}

		System.out.println(maxIndex);
		System.out.println(subIndex);
		System.out.println(students.get(maxIndex).toString());
		System.out.println(students.get(subIndex).toString());


		/*		
 		for(int i = 0; i < students.size(); i++) {

			for(int j = 0; j < students.size(); j++) {

				if(students.get(i).getScore() > 
						students.get(j).getScore() && students.get(i).getScore() > 
							highScore) {

					highScorer = students.get(i).getName();
					highScore = students.get(i).getScore();

				}

			}


		}	
		 */

	}

}

