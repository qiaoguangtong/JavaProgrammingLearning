import java.util.Date;

/**
 * @author Master_Joe
 *
 */
class Account {
	private int id = 0; // Default 0
	private double balance = 0; // Default 0
	private double annualInterestRate = 0; // Default annual interest is 0
	private Date dateCreated ;	// date for registering
	public Account() {
		
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate/100;
	}
	
	public Date getCreatedDate() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate/12.00;
	}
	
	public double getMonthlyInterest() {
		return getMonthlyInterestRate()*balance;
	}
	
	public void withdraw(double withdraw) {
		balance -= withdraw;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
}