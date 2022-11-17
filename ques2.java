
class BankAccount
{
	int accno=100;
	double balance;
	
	BankAccount()
	{
		
	}
	
	BankAccount(int x)
	{
		System.out.println("====Welcome to LenaDena Bank====");
		accno = accno + 1;
		balance = x;
		System.out.println("Account "+ accno +" Created Successfully with balance: " + balance);
		System.out.println();
	}
	
	void withdraw(int bal) throws Exception
	{
		if(bal<balance)
		{
			balance = balance - bal;
			System.out.println("Money Withdrawn : Rs" + bal);
			System.out.println();
		}
		
		else
		{
			throw new Exception("Withdrawn Amount Rs"+ bal +" more than Balance");
		}

	}
	
	void deposit(int bal)
	{
		balance = balance + bal;
		System.out.println("Rs" +bal + " Money Deposited");
		System.out.println();
	}
	
	void show()
	{
		System.out.println("Account Number : " + accno);
		System.out.println("Balance : Rs" + balance);
		System.out.println();
	}
}


class ques2
{
	public static void main(String args[])
	{
		BankAccount ba = new BankAccount(1000);
		
		ba.show();
		
		ba.deposit(1000);
		
		ba.show();
		
		try
		{
			ba.withdraw(1000);
		}
		
		catch(Exception e)
		{
			System.out.println("==Invalid Input==");
		}
		ba.show();
		
		try
		{
			ba.withdraw(5000);
		}
		
		catch(Exception e)
		{
			System.out.println("==Invalid Input==" + e);
		}
		
		ba.show();
	}
}