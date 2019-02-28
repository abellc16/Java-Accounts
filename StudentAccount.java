/**
 * @author     Camby Abell
 * @assignment assg2_Abell
 * @filename   StudentAccount.java
 */

package assg3_Abell;

import java.text.*;

public class StudentAccount 
{
	private long       acctNo;
	private double     balance;
	public static long counter = 1;
	
	// Use DecimalFormat to format the balance more like actual money.
	DecimalFormat format = new DecimalFormat("#0.00");
	
	/**
	 * This constructor is parameterless and will set the balance to 0 and
	 * the account number will be generated in sequential order, based on 
	 * the counter.
	 */
	public StudentAccount()
	{
		acctNo = counter;
		balance = 0;
		counter++;
	}
	
	/**
	 * This constructor will set the balance to (a and the account number will
	 * be generated in sequential order, based on the counter.
	 * @param a - a number that will set the initial balance.
	 */
	public StudentAccount(double a)
	{
		acctNo = counter;
		balance = a;
		counter++;
	}
	
	/**
	 * getAcctNo() returns the account number of account that calls it.
	 * @return acctNo - the account number of the StudentAccount.
	 */
	public long getAcctNo()
	{
		return acctNo;
	}
	
	/**
	 * getBalance() returns the formatted balance of the account that calls it.
	 * @return balance - the balance of the StudentAccount.
	 */
	public String getBalance()
	{
		String bal = "$" + format.format(balance);
		return bal;
	}
	
	/**
	 * getCounter() returns the value of counter.
	 * @return (counter - 1) - since the counter starts at 1 (for the initial
	 * account number) we must subtract 1 to get the right number of active
	 * accounts.
	 */
	public long getCounter()
	{
		return counter - 1;
	}
	
	/**
	 * setBalance(bal) will set the balance of an account to (bal).
	 * @param bal - the value that will be stored into an account's balance.
	 */
	public void setBalance(double bal)
	{
		balance = bal;
	}
	
	/**
	 * deposit(val) will deposit an amount (val) into an account balance as 
	 * long as the amount is positive.
	 * @param val - the amount that will be added to an account.
	 */
	public void deposit(double val)
	{
		if(val < 0)
		{
			System.out.println("ERROR: Amount must be greater than 0");
		}
		else
		{
			this.balance = this.balance + val;
		}
	}
	
	/**
	 * charger(val) will deduct an amount (val) from an account balance as 
	 * long as the amount is positive.
	 * @param val - the amount that will be deducted from an account.
	 */
	public void charge(double val)
	{
		if(val < 0)
		{
			System.out.println("ERROR: Amount must be greater than 0");
		}
		else
		{
			this.balance = this.balance - val;
		}
	}
	
	/**
	 * transferIn(acct, val) will add an amount (val) to an account's balance, 
	 * and deduct it from another account's (acct) balance. 
	 * @param acct - the account the amount will be coming from.
	 * @param val - the amount that will be transferred.
	 */
	public void transferIn(StudentAccount acct, double val)
	{
		if(val < 0)
		{
			System.out.println("ERROR: Amount must be greater than 0");
		}
		else
		{
			this.balance = this.balance + val;
			acct.balance = acct.balance - val;
		}
	}
	
	/**
	 * transferOut(acct, val) will deduct an amount (val) from an account's 
	 * balance, and add it to another account's (acct) balance.
	 * @param acct - the account that will be transferring money to.
	 * @param val - the amount that will be transferred out.
	 */
	public void transferOut(StudentAccount acct, double val)
	{
		if(val < 0)
		{
			System.out.println("ERROR: Amount must be greater than 0");
		}
		else
		{
			this.balance = this.balance - val;
			acct.balance = acct.balance + val;
		}
	}
	
	/**
	 * printInfo() will print the account number and current balance of a 
	 * StudentAccount in a clear, readable format.
	 */
	public void printInfo()
	{
		String info = "Account number: " + this.acctNo 
				+ "\nCurrent balance: " + this.getBalance();
		
		System.out.println(info);
	}
	
	/**
	 * toString() will print the account number and current balance of a 
	 * StudentAccount in a clear, readable format.
	 */
	public String toString()
	{
		return "Account number: " + this.acctNo 
				+ "\nCurrent balance: " + this.getBalance();
	}
}
