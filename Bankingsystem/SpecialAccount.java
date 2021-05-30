package Bankingsystem;
import java.util.Scanner;
/**
 * 
 * @author Youssef Wael
 * Class SpecialAccount allows over drafting
 */

public class SpecialAccount extends Account {
		long withdraw()
	{
		long cash_out;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the withdraw money");
		cash_out=sc.nextLong();
		if(cash_out>Balance && cash_out - Balance<=1000) {
			long demo=1000;
			demo=Balance+demo;
			demo-=cash_out;
			Balance=demo-1000;
			System.out.println("Successful withdraw process\n your balance is"+Balance+"\n");
			System.out.println("------------------------------------\n");
			if (Balance<=-1000) {
				System.out.println(" you reached overdrafting limit\n");
				System.out.println("------------------------------------\n");
			}
		}
		else if(cash_out - Balance>1000)
		{
			System.out.println("invalid operation\n");
			System.out.println("------------------------------------\n");
		}
		else 
		{
			Balance-=cash_out;
			System.out.println("Successful withdraw process\n your balance is"+Balance+"\n");
			System.out.println("------------------------------------\n");
		}
		return Balance;
	}	

		/**
		 * overrided withdraw method allows over drafting for 1000
		 */

}
