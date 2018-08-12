package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountMaker {
	
	public static Date dateCreator(String d) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date date = null;
		try {
			date = format.parse(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static void main(String[] args) {
		
		Account firstAccount = new Account();
		Account secondAccount = new Account(1000000, 0.05);
		Account thirdAccount = new Account(200, 0.02, dateCreator("11/11/2011 11:11:11"));
		
		System.out.println(firstAccount.deposit(400));
		System.out.println(thirdAccount.withdraw(50));
		
		System.out.println(firstAccount.toString());
		System.out.println(secondAccount.toString());
		System.out.println(thirdAccount.toString());
		
	}

}
