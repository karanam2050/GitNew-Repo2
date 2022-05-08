package icici.loans.carloans;

public class HDFC implements Rbi,Rbi1
{

	public static void main(String[] args) 
	{
		
       HDFC i = new HDFC();
       i.deposit();
       i.withdrawl();
       i.miniStatement();
	}

	@Override
	public void withdrawl() 
	{
		
		System.out.println("i am overriden withdrawl in HDFC");
	}

	@Override
	public void deposit() 
	{
       System.out.println("i am overriden deposit in HDFC");		
	}

	@Override
	public void miniStatement()
	{
	System.out.println("i am overriden miniStatement in HDFC");	
		
	}

}
