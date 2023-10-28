package NumberPrograms;

public class StrongNumber //1!+4!+5=145
{
	static int factorial(int dig)
	{
		int fact=1;
		for(int i=dig;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) 
	{
		int n=145;
		int copy=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+factorial(rem);
			n=n/10;
		}
		if(sum==copy)
			System.out.println("strong number");
		else
			System.out.println("not a strong number");

	}

}
