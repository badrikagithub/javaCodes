package scannerclass;

import java.util.Scanner;

public class AllMethodsOfScanner {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter int type data");
		int a=s.nextInt();
		System.out.println("enter double type data");
		double b=s.nextDouble();
		
		System.out.println(b);
		System.out.println("enter float type data");
		float f=s.nextFloat();
		System.out.println("enter short type data");
		short s1=s.nextShort();
		System.out.println("enter boolean type data");
		boolean bol=s.nextBoolean();
		System.out.println("enter string type data");
		String str=s.next();
		System.out.println(str);

	}

}
