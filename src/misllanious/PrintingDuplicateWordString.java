package misllanious;

import java.util.LinkedHashSet;

public class PrintingDuplicateWordString {

	public static void main(String[] args)
	{	
		/*LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(String eachword:splitword)
		{
			
			System.out.print(eachword);
			set.add(eachword);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("printing the duplicates words");
		for(String string1:set)
		{
			int count=1;
			for( String string2:splitword)
			{
				if(string1.equals(string2))
				{
					count++;
				}
				if(count>1)
				{
					System.out.print(string1);
				}
			}
			
		}*/
		String s="welcome to the to welcome to the world";
		String[] splitword = s.split("");
		for(int i=0;i<s.length();i++)
		{
			//char word = s.charAt(i);
			int count=0;
			for(int j=i+1;j<s.length();j++)
			{
				if(i==j)
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(i+" "+"present"+" "+count+"times");
			}
		}
		

	}

}
