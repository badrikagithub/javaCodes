package NumberPrograms;

public class PrimeNumber {

	public static void main(String[] args) 
	{
	/*	int n=9;
		boolean flag=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
			
		
		}
		if(flag==true)
			System.out.println("prime number");
		else
			System.out.println("not a prime number");*/
		
		
	//Print 10 prime nob
		
		
		
			  int num = 20, count;

			  for (int i = 1; i <= num; i++) 
			  {
			   count = 0;
			   for (int j = 2; j <= i / 2; j++) 
			   {
			    if (i % j == 0) 
			    {
			     count++;
			     break;
			    }
			   }

			   if (count == 0) 
			   {
			    System.out.println(i);
			   }

		
		
		
		
		
		
		

	}
	}
}
