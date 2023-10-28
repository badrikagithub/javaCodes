package misllanious;

public class MethodOverloading
{
	public static void test()
	{
		System.out.println("1");
	}
	public static void test(int a)
	{
		System.out.println("2");
	}
	public static void main(String[] args) 
	{
		//MethodOverloading t=new MethodOverloading();
		//t.test(); for non staic call
		MethodOverloading.test(8);//for static call
		
	
	}

	

}
