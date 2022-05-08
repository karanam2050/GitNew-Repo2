package icici.loans.carloans;

public interface Rbi
{
	int x =100;
	
	public void withdrawl();//this is abstract behaviour
    public void deposit();// so it has no body
    
    public static void main(String[] args) 
    {
    	//Rbi = new Rbi();
    	
    	Rbi i;
    	i=new HDFC();
    	i.deposit();
    	i.withdrawl();
    	
    	
    	i=new IOB();
    	i.deposit();
    	i.withdrawl();
		
	}
	
}
