package StringProgram;

public class RemovingSpecialCharFromString {

	public static void main(String[] args) 
	{
		String s="@#$%java^&*!*selenium$%?&^@sql";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
