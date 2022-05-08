package icici.loans.carloans;

public class IOB implements Rbi,Rbi1
{

	public static void main(String[] args)
	{
	  IOB i = new IOB();
	  i.deposit();
	  i.withdrawl();
	}

	@Override
	public void withdrawl()
	{
       System.out.println("i am overriden withdrawl in IOB");		
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("i am overriden deposit in IOB");
		
	}

}
