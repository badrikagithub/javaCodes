package misllanious;

public class Test 
{
	void show()
	{
		System.out.println("1");
	}

 class xyz extends Test
  {
	 void show()
	 {
		 System.out.println("2");
	 }
  }	
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.show();
				

	}

}
