package bankAccount;

public class BankAccount {

	 private String accountName;
	 private String accountNum;
	 private double balance;
	 private boolean isOverDraftAllowed;
	 private double overDraftSum;
	
	public BankAccount() {
		this.accountName = "Account";
		this.accountNum = "000001";
		this.balance = 0;
		this.isOverDraftAllowed = false;
		this.overDraftSum = 0;
	}

	public BankAccount(String accountName, String accountNum, double balance, boolean isOverDraftAllowed,
			double overDraftSum) {
		super();
		this.accountName = accountName;
		this.accountNum = accountNum;
		this.balance = balance;
		this.isOverDraftAllowed = isOverDraftAllowed;
		this.overDraftSum = overDraftSum;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isOverDraftAllowed() {
		return isOverDraftAllowed;
	}

	public void setOverDraftAllowed(boolean isOverDraftAllowed) {
		this.isOverDraftAllowed = isOverDraftAllowed;
	}

	public double getOverDraftSum() {
		return overDraftSum;
	}

	public void setOverDraftSum(double overDraftSum) {
		this.overDraftSum = overDraftSum;
	}
	
	public void deposite(double amount) {
		balance+= (amount >0) ? amount: 0 ;
		if (amount >0)
		System.out.println("You deposited $"+ amount + " Your balance is $"+ balance+"\n");
		else System.out.println("You can't deposit a negative amount!\n");
	}
	
	public double withdrawal (double amount ) {
		double withdrawalAmount;
		
		if (amount >0) {
		if (!isOverDraftAllowed) {
			withdrawalAmount= (balance-amount>=0)? amount: balance;
			balance-= withdrawalAmount;
		System.out.println("You withdrew $"+ withdrawalAmount + " Your balance is $"+ balance+"\n");		
		return withdrawalAmount;
		}
		else {
			withdrawalAmount= (balance+overDraftSum-amount>=0)? amount: balance+overDraftSum;
			balance-= withdrawalAmount;
			System.out.println("You withdrew $"+ withdrawalAmount + "Your balance is $"+ balance+"\n");
			return withdrawalAmount;
		}
	}
		else System.out.println("You can't withdraw a negative amount!\n");
		return balance;
	}
	
	
	public void  showinfo() {
		System.out.println("---Acoount info---\n"
				+ "Account Name: " +accountName
				+ "\nAccount Number: " + accountNum
				+ "\nYour balance: "+ balance
				+ "\nIsOverDraftAllowed: "
				+ ((isOverDraftAllowed)? true : false)
				+ "\nOverDraftSum: "+overDraftSum
                + "\n");
	}
	
}
