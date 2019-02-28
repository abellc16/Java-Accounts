/**
 * @author     Camby Abell
 * @assignment assg2_Abell
 * @filename   RewardsAccount.java
 */

package assg3_Abell;

public class RewardsAccount extends StudentAccount
{
	private double rewards;
	
	/**
	 * RewardsAccount() is a parameterless constructor that uses it's 
	 * superclass, and it will also set rewards to 0.
	 */
	public RewardsAccount()
	{
		super();
		rewards = 0;
	}
	
	/**
	 * RewardsAccount(val) will use it's superclass, and will set the rewards
	 * balance to 0 if (val) is less than 100, and it will set rewards to 5 if
	 * (val) is greater than or equal to 100.
	 * @param val - the initial value for balance.
	 */
	public RewardsAccount(double val)
	{
		super(val);

		if(val >= 100)
		{
			rewards = 5;
		}
		else
		{
			rewards = 0;
		}
	}
	
	/**
	 * getrewards() returns the current rewards balance.
	 * @return rewards - the current rewards balance.
	 */
	public double getRewards()
	{
		return rewards;
	}
	
	/**
	 * redeemRewards() will deposit 5 into an acocunt's balance, as long as
	 * that account's rewards balance is at least 25. Redeeming rewards will
	 * reset the rewards balance back to 0.
	 */
	public void redeemRewards()
	{
		if(this.rewards >= 25)
		{
			this.rewards = 0;
			this.deposit(5);
		}
		else
		{
			System.out.println("ERROR: Insufficient rewards balance.");
		}
	}
	
	/**
	 * toString() will print the account number, current balance, and the
	 * rewards balance of a RewardsAccount in a clear and readable format.
	 */
	public String toString()
	{
		return super.toString() + "\nRewards balance: " + this.rewards;
	}
	
	/**
	 * deposit(val) will add an amount (val) into an account's balance. If the
	 * deposit amount is greater or equal to 100, the the account's rewards 
	 * balance will be increased by 5.
	 */
	public void deposit(double val)
	{
		super.deposit(val);
		
		if(val >= 100)
		{
			this.rewards += 5;
		}
	}
	
	/**
	 * toString() will print the account number, current balance, and the
	 * rewards balance of a RewardsAccount in a clear and readable format.
	 */
	public void printInfo()
	{
		super.printInfo();
		System.out.println("Rewards balance: " + this.rewards);
	}	
}
