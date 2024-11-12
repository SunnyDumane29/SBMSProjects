package string;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1_RemoveDuplictaefromString {

	//Auto Remove duplicates rome string 
	
	public void removeDuplictaeFromString(String givenStr)
	{
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		
		for(int i = 0; i<givenStr.length(); i++) {
			
			set.add(givenStr.charAt(i));
			
		}
		
		for(Character check:set)
		{
			System.out.println("Print Value : "+check);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Demo1_RemoveDuplictaefromString obj1= new Demo1_RemoveDuplictaefromString();
		obj1.removeDuplictaeFromString("ABCABC");
		
	}
	
}
