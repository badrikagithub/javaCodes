package misllanious;

import java.util.LinkedHashSet;

public class PrintDuplicateValuesofString {

	public static void main(String[] args) 
	{
		String s="addmissionn";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			 System.out.print(s.charAt(i));
			 set.add(s.charAt(i));		 
		}
		System.out.println("");
		System.out.println("");
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
				if(count>1)
				{
					System.out.print(ch);
				}
				
			}
			
		}
	}

}
