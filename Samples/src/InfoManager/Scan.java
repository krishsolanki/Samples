package InfoManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		ArrayList<String> allInfo = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first name:");	
		String fName = in.nextLine();
				
		System.out.println("Enter last name:");	
		String lName = in.nextLine();
		
		System.out.println("Enter age:");	
		String age = in.nextLine();
		
		System.out.println("Enter birthday:");	
		String birthday = in.nextLine();
		
		System.out.println("Enter location:");	
		String location = in.nextLine();

		allInfo.add(fName);
		allInfo.add(lName);
		allInfo.add(age);
		allInfo.add(birthday);
		allInfo.add(location);
		
		
		System.out.println(allInfo.toString());
		
		
	}

}
