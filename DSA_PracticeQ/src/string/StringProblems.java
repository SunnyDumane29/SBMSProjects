package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringProblems {

// 1)  Reverse A Sring
	public String revStr(String givStr)
	{
		char ch [] = givStr.toCharArray();
		
		String revStr="";
		
		for(int i=ch.length-1; i>=0; i--)
		{
			revStr= revStr+ch[i];
			
			
		}
		
		return revStr;
		
	}

// 2) Given a string s, find the length of the longest substring without repeating characters.
	
	public void longStringRepeated(String str)
	{
		String longestSubstring = null;
		int longestSubStringLenght= 0;
		
		Map<Character,Integer> map = new LinkedHashMap <Character,Integer>();   // LinkedHashMap == used to maintain incertion Order of STring
		
		char [] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			char ch= arr[i];
			
			//------------------------
			if (!(map.containsKey(ch)))
			{
				map.put(ch, i);  
				
			}else {
				i = map.get(ch);   
				map.clear();
			}
			
			if(map.size() > longestSubStringLenght)
			{
			
				longestSubStringLenght= map.size();
				longestSubstring = map.keySet().toString();
			}
			//----------------------------------
			
		}
		
		
		System.out.println("The Longest substring : "+longestSubstring);
		System.out.println("The length of Longest Substring : "+longestSubStringLenght);
			
		
		
	}
	
	
	//-----------------------------------------------------------------------------------------
	//-------Main Method----------------------------------------------------------------------------------

	
	public static void main(String[] args) {
		
		StringProblems Sp= new StringProblems();
		
		// 1)  Reverse String
		// System.out.println(Sp.revStr("Amol"));
		
		// 2) Given a string s, find the length of the longest substring without repeating characters.
		Sp.longStringRepeated("asdasdasdfgfh");
	}
	
	
}
