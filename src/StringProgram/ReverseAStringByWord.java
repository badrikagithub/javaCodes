package StringProgram;

public class ReverseAStringByWord {

	public static void main(String[] args) 
	{
		String str="go get a job";
		String [] sr=str.split(" ");
		for(int i=sr.length-1;i>=0;i--)
		{
			if(i>0)//to eleminate the space before the 1st word i.e go.
				System.out.print(sr[i]+" ");
			else
				System.out.print(sr[i]);
		}
		
		
		
		
       /* String s = "Laptop";
		
		for (int i = s.length()-1; i >=0; i--) 
		{
			System.out.print(s.charAt(i)+"");
		}*/

	}

}
 