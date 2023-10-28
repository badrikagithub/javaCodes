package arrayPrograms;

public class RightRotation {

	public static void main(String[] args) 
	{
		int [] arr= {1,2,3,4,5};//4,5,1,2,3
		int [] res=new int[arr.length];
		int x=0;
		int shift=2;
		for(int i=arr.length-shift;i<arr.length;i++)
		{
			res[x++]=arr[i];
		}
		for(int i=0;i<arr.length-shift;i++)
		{
			res[x++]=arr[i];
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}

	}

}
 