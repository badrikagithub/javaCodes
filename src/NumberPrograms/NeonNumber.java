package NumberPrograms;

public class NeonNumber {

	public static void main(String[] args)
	{

       int n=9;
       int sq=n*n;
       int sum=0;
       while(sq>0)
       {
    	   int rem=sq%10;
    	   sum=sum+rem;
    	   sq=sq/10;
       }
       if(n==sum)
    	   System.out.println("Neon Number");
       else
    	   System.out.println("Not Neon Number");

	}

}
