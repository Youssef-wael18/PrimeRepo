package Bankingsystem;

public class main {

	public static void main(String[] args) {
		Account a1 = new Account() ;
		Account a2=new SpecialAccount();
		a1.setAccount_Number("20190649");
		a1.setBalance(1000);
		a2.setAccount_Number("20190648");
		a2.setBalance(500);
		a2.withdraw();
		a1.withdraw();
		a2.deposit();
		a1.deposit();
	}

}
