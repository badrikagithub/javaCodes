package NumberPrograms;

public class SunnyNumber {

	public static void main(String[] args)
	{
		int n=8;
		int sunny=n+1;
		boolean flag=false;
		
		for(int i=1;i<n;i++)
		{
			if(i*i==sunny)
			{
				flag=true;
				break;
			}
		}
		if (flag==true)
			System.out.println("its sunny number");
		
		else 
		
			System.out.println("not a sunny number");
		

	}

}
