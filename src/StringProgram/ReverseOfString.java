package StringProgram;

public class ReverseOfString {

	public static void main(String[] args)
	{
		String str="Shake it Pushpavati";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);//or reverse+=str.charAt(i); update
		}
		System.out.println(reverse);

	}

}
