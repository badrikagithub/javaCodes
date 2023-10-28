package StringProgram;

public class Specialchar {

	public static void main(String[] args) 
	{
		String str="f@gh #%7a UYH*";
		int spcl=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&& ch<='9')==false)
			{
				spcl++;
			}
			System.out.print(spcl);
		}

	}

}
 