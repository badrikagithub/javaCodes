package arrayPrograms;

public class FindCommonEleInTWO_Array {

	public static void main(String[] args)
	{
		int []a= {32,67,83,67,90,43,32,10};
		int []b= {8,90,54,43,32,65,67};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
					
				}
				
			}
			
		}

	}

}
