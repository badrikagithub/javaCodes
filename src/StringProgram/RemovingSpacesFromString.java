package StringProgram;

public class RemovingSpacesFromString {

	public static void main(String[] args)
	{
		String s="Advance  selenium automation framework";
		String str = s.replaceAll("//s", "");
		System.out.println(str);
	}

}
