package scannerclass;

import java.util.Scanner;

public class ArrayUsingScannerClass {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int n=s.nextInt();
		int [] a=new int [n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			
		}
		
		System.out.println("==============");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
