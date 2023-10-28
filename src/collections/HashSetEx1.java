package collections;

import java.util.HashSet;

public class HashSetEx1 {

	public static void main(String[] args) 
	{
		/*HashSet hs=new HashSet();
		hs.add(100);
		hs.add("Hii");
		hs.add('B');
		hs.add(10.5);
		hs.add(null);
		hs.add(true);
		System.out.println(hs);*/
		
		HashSet<Integer> evennums=new HashSet<Integer>();
		evennums.add(2);
		evennums.add(4);
		evennums.add(6);
		evennums.add(8);
		evennums.add(10);
		System.out.println(evennums);
		
		HashSet<Integer> nums=new HashSet<Integer>();
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		System.out.println(nums);
	/*	//union
		evennums.addAll(nums);
		System.out.println(evennums);
		
		//intersection
		evennums.retainAll(nums);
		System.out.println(evennums);*/
		
		//difference
		evennums.removeAll(nums);
		System.out.println(evennums);
		
		
		
		
		
		
		
		
		
	}

}
