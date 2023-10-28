package misllanious;

public class StringReversal {

	public static void main(String[] args) 
	{
		String s="i am from Baripada";
	/*	String rev = "";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);*/
		
		
		StringBuffer sf=new StringBuffer(s);	
		System.out.println(sf.reverse());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
 
}
