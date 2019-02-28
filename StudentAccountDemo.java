/**
 * @author     Camby Abell
 * @assignment assg2_Abell
 * @filename   StudentAccountDemo.java
 */

package assg3_Abell;

public class StudentAccountDemo 
{
	public static void main(String args[])
	{
		// Create 4 accounts, 2 RewardsAccount and 2 StudentAccount
		RewardsAccount acct1 = new RewardsAccount(105.2375687643);
		RewardsAccount acct2 = new RewardsAccount();
		StudentAccount acct3 = new StudentAccount(-143.34083);
		StudentAccount acct4 = new StudentAccount();
		
		// Print account numbers using getAcctNo method to assure they are
		// in sequential order.
		System.out.println("Account numbers: ");
		System.out.println(acct1.getAcctNo());
		System.out.println(acct2.getAcctNo());
		System.out.println(acct3.getAcctNo());
		System.out.println(acct4.getAcctNo());
		
		// Print the counter to tell us how many accounts are active
		System.out.println("Counter: ");
		System.out.println(acct3.getCounter());
		
		// Print initial balances of all of the accounts
		System.out.println("Initial balances: ");
		System.out.println(acct1.getBalance());
		System.out.println(acct2.getBalance());
		System.out.println(acct3.getBalance());
		System.out.println(acct4.getBalance());
		
		// Set the balances of the accounts with zero dollars
		acct2.setBalance(543.22);
		acct4.setBalance(99.99);
		
		// Deposit into each account
		acct1.deposit(110.43);
		acct2.deposit(3);
		acct3.deposit(1);
		acct4.deposit(.01);
		
		// Charge each account
		acct1.charge(80);
		acct2.charge(500);
		acct3.charge(23.55);
		acct4.charge(92.33);
		
		// Transfer in from one account to another
		acct1.transferIn(acct2, 12.12);
		acct3.transferIn(acct4, 22);
		acct1.transferIn(acct3, 9.12);
		acct4.transferIn(acct2, 76.98);
		
		// Transfer out from one account to another
		acct1.transferOut(acct2, 12.12);
		acct3.transferOut(acct4, 2);
		acct1.transferOut(acct3, 9.12);
		acct4.transferOut(acct2, 76.98);
		
		// Show rewards balances for rewards accounts
		System.out.println("Rewards balances: ");
		System.out.println(acct1.getRewards());
		System.out.println(acct2.getRewards());
		
		// Test redeemRewards
		acct1.deposit(110.43);
		acct1.deposit(110.43);
		acct1.deposit(110.43);
		
		System.out.println(acct1.getRewards());
		
		acct1.redeemRewards();
		
		System.out.println(acct1.getRewards());
		
		// Test both print methods on both types of accounts
		System.out.println(acct1.toString() + "\n");
		acct2.printInfo();
		System.out.println("\n");
		System.out.println(acct3.toString() + "\n");
		acct4.printInfo();
	}
}
