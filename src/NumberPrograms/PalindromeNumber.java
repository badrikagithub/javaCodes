package NumberPrograms;

public class PalindromeNumber {

	public static void main(String[] args)
	{
		int n=121;
		int rev=0;
		int temp=n;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(temp==rev)
		    System.out.println("palindrome Number");
		else
			System.out.println("Not A palindrome Number");


	}

}
