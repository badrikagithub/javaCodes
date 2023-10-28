package arrayPrograms;

public class SeachingOfArrayElement {

	public static void main(String[] args) 
	{
		int [] arr= {4,7,8,9,3,19};
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
			System.out.println("element not found");

	}

}
 