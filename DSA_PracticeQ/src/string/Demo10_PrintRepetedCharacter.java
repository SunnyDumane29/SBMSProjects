package string;

import java.util.Iterator;

public class Demo10_PrintRepetedCharacter {

	
	public static void main(String[] args) {
		
		String str= "SunnyddTT";
	int size =	str.length();
		char []chr = str.toCharArray();
		
		
		for (int i = 0; i < chr.length; i++) {
			
			for (int j = i+1; j < chr.length; j++) {
				
				if(chr[j]==chr[i])
				{
					
					System.out.println("Print duplicate :"+chr[j]);
					break;
				}
				
			}
			
		}
	}
}
