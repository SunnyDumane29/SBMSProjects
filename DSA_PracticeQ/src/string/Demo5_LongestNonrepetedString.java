package string;

import java.util.LinkedHashMap;

public class Demo5_LongestNonrepetedString {

	public void checLongestStringNonRepeted(String givnStr)
	{
		String longestStringNonrepeted= "";
		int longestStringNonrepetedSize= 0;
		
		char [] charArry = givnStr.toCharArray();
		LinkedHashMap<Character,Integer> mapCretaed= new LinkedHashMap<Character,Integer>();
		
		for(int i =0; i<charArry.length; i++)
		{
			char char1=charArry[i];
			
			
			if (!(mapCretaed.containsKey(char1)))
			{
				mapCretaed.put(char1, i);
				
			}else {
			   i=mapCretaed.get(char1);
			   mapCretaed.clear();
			}
			
			if (mapCretaed.size() > longestStringNonrepetedSize)
			{
				 longestStringNonrepeted= mapCretaed.keySet().toString();
				 longestStringNonrepetedSize= mapCretaed.size();
				
			}
		}
		
		System.out.println("LOngest String non repeted character :"+longestStringNonrepeted);
		System.out.println("LOngest String non repeted Size :"+longestStringNonrepetedSize);
		
	}
	
	
	public static void main(String[] args) {
		Demo5_LongestNonrepetedString pp= new Demo5_LongestNonrepetedString();
		pp.checLongestStringNonRepeted("asdfgasdfgghj");
		
		
	}
	
}
