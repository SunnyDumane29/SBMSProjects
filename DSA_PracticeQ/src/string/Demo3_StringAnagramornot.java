package string;

import java.util.Arrays;

public class Demo3_StringAnagramornot {

	// check String is AnagramorNot 
	// check element is in the given string or not even if the oderis not matched 
	
	public void checkStringAnagramorNot(String givenStr1, String checkString2)
	{
		char [] parentStr=givenStr1.toCharArray();
		char []cildCompairStr=checkString2.toCharArray();
		
		Arrays.sort(parentStr);
		Arrays.sort(cildCompairStr);
		
		Arrays.equals(parentStr, cildCompairStr);
		
		if (Arrays.equals(parentStr, cildCompairStr))
		{
			System.out.println("Strings are anagram");
			
		}else {
			System.out.println("Strings are Not - anagram");

			
		}
	
	}
	
	public static void main(String[] args) {
		
		Demo3_StringAnagramornot pp = new Demo3_StringAnagramornot();
		
		pp.checkStringAnagramorNot("java", "asdad");
		
	}
	
	
}
