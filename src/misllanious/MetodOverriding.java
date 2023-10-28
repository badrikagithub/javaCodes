package misllanious;

public class MetodOverriding 
{
	void test()
	{
		System.out.println("in test Method");
	}
}
 class Animal extends MetodOverriding
{
	 void test()
	 {
		 System.out.println("2");
	 }
	 
	
	
	public static void main(String[] args) 
	{
		MetodOverriding m=new MetodOverriding();
				m.test();
				
	}



	}


