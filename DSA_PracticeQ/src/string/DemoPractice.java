package string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class DemoPractice {

	
	public void checkReverseString(String str)
	{
		char [] arr= str.toCharArray();
		
		String revers="";
		
		for(int i=arr.length-1; i>=0 ; i--)
		{
			revers= revers +arr[i];
		}
		
		System.out.println("Reversed String :"+revers);
		
	}
	
	
	public void removeduplicate(String str)
	{
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		
		for(int i=0; i<str.length(); i++)
		{
			
			set.add(str.charAt(i));
		}
		
		for(Character check:set)
		{
		
			System.out.println(check);
		}
		
	}
	
	public void checkStringisPalendrome(String str)
	{
		char [] ch=str.toCharArray();
		String revStr="";
		
		for (int i=ch.length-1; i>=0; i--)
		{
			revStr=revStr+str.charAt(i);
		}
		
		if (revStr.equals(str))
		{
			System.out.println("String is palendrome");
		}
		else {
			System.out.println("String is not palendrom");
		}
		
	}
	
	public void checktwoSum(int target)
	{
		int [] num = {2,4,6,18,2,54,34,76};
		
		int num1=0;
		int num2=0;
		
		Arrays.sort(num);
		
		for (int i=0; i<num.length-1; i++)
		{
			int summ=num[i+1]+num[i];
			
			if (summ == target)
			{
				num1=num[i+1];
				num2=num[i];
			}
			
		}
		
		System.out.println("Twoooo :"+num1+","+num2);
	}
	
	
	public void findclosestValue()
	{
		int[] myArray = {19, 50, 99, 7, 88, 14, 65};
		Arrays.sort(myArray);
		
		int num1=0;
		int num2=0;
		
		
		int diffranceMax=Integer.MAX_VALUE;
		
		for (int i=1; i<myArray.length; i++)
		{
			
			int diffCheck= myArray[i]-myArray[i-1];
			
			if (diffranceMax >diffCheck)
			{
				diffranceMax=diffCheck;
				num1=myArray[i];
				num2=myArray[i-1];
				
			}
			
		}
		
		
		System.out.println("two closest valvue are :"+num1+","+num2);
		System.out.println("Dirance is :"+diffranceMax);
	}
	
	
	//-------------------------------------------------------------------------
	public static void main(String[] args) {
		
		DemoPractice dd= new DemoPractice();
		dd.findclosestValue();
		
	}
}
