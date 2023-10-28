package NumberPrograms;

public class HCForGCDofNUMBER 
{

	public static void main(String[] args)
	{
		int num1=36;
		int num2=24;
		int gcd=1;
		for(int i=1;i<num1/2 && i< num2/2;i++)
		{
		if(num1%i==0 && num2%i==0)    //something is wrong
			gcd=i;
	    }
		System.out.println(gcd);

	}

}
