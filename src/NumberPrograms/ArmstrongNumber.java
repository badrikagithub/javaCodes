package NumberPrograms;

public class ArmstrongNumber 
{
	static int power(int d,int count)
	{
		int prod=1;
		for(int i=1;i<=count;i++)
		{
			prod=prod*d;
		}
		return prod;
	}

	public static void main(String[] args)
	{
		int n=153;
		int copy=n;
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;//15
		}
		int sum=0;
		for(int i=copy;i>0;i=i/10)
		{
			sum=sum+power(i%10,count);
			
		}
		if(copy==sum)
			System.out.println("armstrong number");
		else
			System.out.println("not armstrong number");	
		
	}

}
