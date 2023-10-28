package arrayPrograms;

public class PalindromOfArray //12321=12321 reverse is same as number
{

	public static void main(String[] args) 
	{
		int [] arr= {1,2,3,2,1};
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=arr[arr.length-1-i]);
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
			System.out.print("palindrome array");
		else
			System.out.println("not a palindrome array");

	}

}
 