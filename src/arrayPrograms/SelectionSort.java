package arrayPrograms;

public class SelectionSort {

	public static void main(String[] args) 
	{
		int [] arr= {7,3,9,4,1};
		for(int i=0;i<arr.length;i++)
		{
			int min=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
 