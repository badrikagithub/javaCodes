package collections;

import java.util.ArrayList;

public class ArraylistDemo1 {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(5);
		al.add("welcom");
		al.add(53.8);
		al.add("hello");
		al.add(22222);
		al.add('A');
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
//		al.removeAll(al);
//		System.out.println(al);
		al.add(3, 'b');
		System.out.println(al);
		al.contains(2);
		System.out.println(al);
		
	//	for(object da:al)
		{
		//	System.out.println(da);
		}
		
		
		

	}

}
