package icici.loans.carloans;

public class CITIBANK implements Rbi 
{

	public static void main(String[] args)
	{
		CITIBANK i = new CITIBANK();
		i.deposit();
		i.withdrawl();
			}

	@Override
	public void withdrawl() 
	{
		System.out.println("i am overriden deposit in CITIBANK");		
	}

	@Override
	public void deposit() 
	{
	 System.out.println("i am overriden withdrawl in CITIBANK");	
		
	}

}
