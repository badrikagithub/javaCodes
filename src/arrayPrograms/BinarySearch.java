package arrayPrograms;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int [] arr= {10,15,20,25,30};
		int find=15;
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		boolean flag=true;
		while(low<=high)
		{
			if(find==arr[mid])
			{
				System.out.println("found");
				flag=false;
				break;
			}
			else if(find>arr[mid])
			{
				low=mid+1;
				 mid=(low+high)/2;
			}
			else
			{
				high=mid-1;
				mid=(low+high)/2;
			}
		}
		if(flag)
		{
			System.out.println("not Found");
		}
	}
}
