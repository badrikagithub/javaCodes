package StringProgram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		String one="race".toLowerCase();
		String two="care".toLowerCase();
		char [] ch1=one.toCharArray();
		char []ch2=two.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean flag=true;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("anagram");
		else
			System.out.println("not an anagram");
			

	}

}
 