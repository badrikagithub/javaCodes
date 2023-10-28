package misllanious;

public class CountTheCharInAString {

	public static void main(String[] args) 
	{
		String s="precution is better than cure";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char charr = s.charAt(i);
			count++;
		}
		System.out.print(count);

	}

}
