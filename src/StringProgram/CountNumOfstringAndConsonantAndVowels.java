package StringProgram;

public class CountNumOfstringAndConsonantAndVowels 
{

	public static void main(String[] args)
	{
		String str="Sheela is a Doctor";
		str.toLowerCase();
		int vc=0;
		int cc=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')//use it to avoid the special charcters
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                  vc++;
				else
					cc++;
			}
		   }
		System.out.println(vc);
		System.out.println(cc);
	}
 }

 