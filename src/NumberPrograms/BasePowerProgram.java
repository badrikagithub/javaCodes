package NumberPrograms;

public class BasePowerProgram {

	public static void main(String[] args) 
	{
		int base=2;
		int pow=3;
		int prod=1;
		for(int i=1;i<=pow;i++)
		{
			prod=base*prod;
		}
		System.out.println("base power of the number is " + prod);

	}

}
