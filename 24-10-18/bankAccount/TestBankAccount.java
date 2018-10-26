package bankAccount;

public class TestBankAccount {

	public static void main(String[] args) {

		
	       	//--- ---------------- test default account------------------------
		System.out.println("      -TEST default account-    ");

		BankAccount account1 = new BankAccount();
		account1.showinfo();

		// ------------------     test account with OverDraft Allowed--------------------------
		System.out.println("     -TEST account with OverDraft Allowed-");

		
		BankAccount account2 = new BankAccount("Eli munk", "201546", 50, true, 200);
		account2.showinfo();
		account2.deposite(50);
		account2.withdrawal(150);
		account2.showinfo();

		// --------------test account with OverDraft NOT Allowed-----------------------
		System.out.println("    -TEST account with OverDraft NOT Allowed-");

		account1 = new BankAccount("Account", "000001", 200, false, 0);
		account1.showinfo();
		account1.deposite(-300);
		account1.withdrawal(2500);
		account1.showinfo();

	}

}
