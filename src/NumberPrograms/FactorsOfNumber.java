package NumberPrograms;

public class FactorsOfNumber {

	public static void main(String[] args) 
	{
		int n=45;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				System.out.println(i+ " is factor of " +n);
		}
		System.out.println(n+" is factor of " +n);

	}

}
