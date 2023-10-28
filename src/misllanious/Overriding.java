package misllanious;

class Bank
{
	int ROI()
	{
		return 20;
		
	}
}
class SBI extends Bank
{
	int ROI()
	{
		return 10;
		
	}
	
}
class BOI extends Bank
{
	int ROI()
	{
		return 5;
		
	}
}
class AXIS extends Bank
{
	int ROI()
	{
		return 8;
		
	}
}

public class Overriding {

	public static void main(String[] args) 
	{
		Bank b=new Bank();
		b.ROI();		
		
		AXIS a=new AXIS();
		int x=a.ROI();
		System.out.println(x);
				

	}

}
