package arrayPrograms;

public class Largest_Smallest_Number {

	public static void main(String[] args) 
	{
		int [] a= {27,5,4,87,654,9854,};
		 int largernum=a[0];
		 int smallernum=a[0];
		 
		 for (int i = 0; i < a.length; i++) 
		{
			 if(largernum<a[i])
			 {
				 largernum= a[i];
				 
			 }
			 else if (smallernum>a[i]) 
			{
				 smallernum=a[i];
			}
			 
			
		}
		 System.out.println("large nub is"+" "+largernum +" "+"smaller nub is"+" "+smallernum);

	}

}
