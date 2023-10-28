package arrayPrograms;

public class SearchElementInArray {

	public static void main(String[] args) 
	{
		int [] arr= {5,7,8,3,9,2};
		int ele=9;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(ele==arr[i])
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
			System.out.println("element found");
		else
		{
			System.out.println("element not found");
		}

	}

}
 