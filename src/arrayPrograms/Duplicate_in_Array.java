package arrayPrograms;

import java.util.Iterator;

public class Duplicate_in_Array {

	public static void main(String[] args) 
	{
		int [] a= {10,20,21,10,33,44,22,10,22,100,21};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("duplicate nob is"+ " "+a[j]);
				}
				
			}
			
		}



	}

}
