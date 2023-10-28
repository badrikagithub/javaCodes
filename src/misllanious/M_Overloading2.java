package misllanious;

public class M_Overloading2 
{
	int a=78;
	int b=56;
	void sum()
	{
		System.out.println(a+b);
	}
	void sum(int x,double y)
	{
	    
	    System.out.println(x+y);
	}

	public static void main(String[] args) 
	{
		M_Overloading2 m=new M_Overloading2();
		m.sum(10,36);

	}

}
