package StringProgram;

public class CountOccuranceOfCharInAString {

	public static void main(String[] args)
	{
		String s="java programming and java language";
		int totalength = s.length();
		int lengthwithouta = s.replace("m", "").length();
		int countA = totalength-lengthwithouta;
		System.out.println(countA);

	}

}
