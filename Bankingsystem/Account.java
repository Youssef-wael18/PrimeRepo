package Bankingsystem;
import java.util.Scanner;

/**
 * Class Account
 * https://en.wikipedia.org/wiki/javadoc
  * @author Youssef Wael
  * @version 4.19.0
   */
public class Account {

	protected long Balance;
	private String Account_Number ;
	/**
	 * default constructor initialize balance with 0 
	 * @param Balance
	 * @param Account_Number
	 */
	Account(){
		Balance = 0;
		Account_Number="0000000000";
	}
	/**
	 * setter for balance
	 */
	void setBalance(long Balance) {
		this.Balance=Balance;
	}
	/**
	 * getter for balance
	 * @return balance value
	 */
	
	long getBalance() {
		return Balance;
	}
	/**
	 * setter for Account_Number 
	 * @param Account_Number
	 */
	
	void setAccount_Number( String Account_Number) {
		this.Account_Number=Account_Number;
	}
	/**
	 * getter for Account_Number
	 * @return Account_Number value
	 */
	String getAccount_Number() {
		return Account_Number;
	}
	
/**
 * function for making deposit
 * @return balance value after deposit
 */
	long deposit()
	{
		long cash_in;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the deposit money");
		cash_in=sc.nextLong();
		Balance+=cash_in;
		System.out.println("Successful deposit process\n your balance is"+Balance+"\n");
		System.out.println("------------------------------------\n");
		return Balance;
	}
	/**
	 * function for withdraw check for enough cash then withdraw
	 * @return balance after withdraw
	 */
	long withdraw()
	{
		long cash_out;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the withdraw money");
		cash_out=sc.nextLong();
		if(cash_out>Balance) {
			System.out.println("There is not enough balance\n");
			System.out.println("------------------------------------\n");
		}else 
		{
			Balance-=cash_out;
			System.out.println("Successful withdraw process\n your balance is"+Balance+"\n");
			System.out.println("------------------------------------\n");
		}
		return Balance;
	}	
	/**
	 * overriding tostring method
	 */
	 public String toString(){
		 return "Account Number : "+Account_Number +"\n"+"Balance : "+Balance+"\n";
	 }
	
}