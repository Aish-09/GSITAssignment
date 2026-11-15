package weeklyassignments;
	
public class Bank_Account_withdrawal {
	
	private String accountHolder;
	private double balance;
	
	public Bank_Account_withdrawal (String accountHolder, double balance )
	{
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public void withdraw (double amount)
	{
		System.out.println("Account Holder : " + accountHolder);
		System.out.println("Cuurent Balance : " + (int) balance);
		System.out.println("Withdrawal Amount : " + (int) amount);
		
		try {
			if (amount < 0)
			{
				throw new IllegalArgumentException("Invalid Input! Withdrawal amount is less");
			}
			if (amount > balance)
			{
				throw new Exception("Insufficent Balance");
			}
			balance -= amount;
					System.out.println("Remaining Balance: "+(int) balance);
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Transaction process completed ");
			System.out.println("\n");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank_Account_withdrawal account1 = new Bank_Account_withdrawal ("Rahul", 100000);
		account1.withdraw(3000);
		
		Bank_Account_withdrawal account2 = new Bank_Account_withdrawal ("Renu", 1000);
		account2.withdraw(3000);
		
		Bank_Account_withdrawal account3 = new Bank_Account_withdrawal ("RenuK", 10000);
		account3.withdraw(-3000);

	}

}
