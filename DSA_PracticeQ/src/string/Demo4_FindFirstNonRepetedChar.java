package string;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Demo4_FindFirstNonRepetedChar {

	// How to find first non repeted character from string
	//from string check character is repeted or not 
	
	public char findFirstRepetedValue(String givnStr)
	{
		 char nonRepetedChar = 0;
         char [] chGivn=  givnStr.toCharArray();

   LinkedHashMap <Character,Integer> countMap= new LinkedHashMap<Character,Integer>();
   
   for(char ch : chGivn)
   {
	   countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch)+1 : 1);
	   
   }
   
   for(Entry <Character,Integer> entry:countMap.entrySet())
   {
	   if (entry.getValue() == 1)
	   {
		    nonRepetedChar= entry.getKey();
	   }
   }

		
		throw new RuntimeException("didnt find any non repetated character"+nonRepetedChar);
		
		
		
		// return nonRepetedChar;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Demo4_FindFirstNonRepetedChar mm=new Demo4_FindFirstNonRepetedChar();
		mm.findFirstRepetedValue("asdfasdfghgkjglfh");
		
	}
	
	
}
