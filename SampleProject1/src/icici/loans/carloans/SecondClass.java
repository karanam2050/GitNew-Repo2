package icici.loans.carloans;

public class SecondClass
{
	int a=100,b=200,result;
	public void add()
	{
		result =a+b;
		System.out.println("Add of A & B is :" + result);
		
		}
	public void sub() //this is concrete behaviour  & it has body
	{
		result = a-b;
		System.out.println("Sub of A & B is :" + result);
		
	}
	public static void main(String[] args) 
		{
	    System.out.println("hello");
	    SecondClass obj = new SecondClass();
	    obj.add();
	    obj.sub();
    }
}