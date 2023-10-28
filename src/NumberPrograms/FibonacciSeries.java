package NumberPrograms;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int f1=0;
		int f2=1;
		int count=10;
		System.out.print(f1+" "+f2);
		for(int i=2;i<count;i++)
		{
			int f3=f1+f2;
			System.out.print(" "+f3);
			f1=f2;
			f2=f3;
		}

	}

}
