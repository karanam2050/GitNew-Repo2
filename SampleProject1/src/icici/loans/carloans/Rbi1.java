package icici.loans.carloans;

public interface Rbi1
{
	public void withdrawl();//this is abstract behaviour
    public void deposit();// so it has no body
    
    public static void main(String[] args) 
    {
    	//Rbi1 = new Rbi1();
    	
    	Rbi1 i;
    	i=new HDFC();
    	i.deposit();
    	i.withdrawl();
    	
    	
    	i= new IOB();
    	i.deposit();
    	i.withdrawl();
		
	}
	
}



