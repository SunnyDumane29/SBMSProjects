package string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class TestCodeHere {

	
	public void checkTwoSum(int targetNum)
	{
		int [] num = {2,4,6,18,2,54,34,76};
		
		Arrays.sort(num);
		
		int num1 = 0;
		int num2 = 0;
		
		for(int i=0; i<num.length-1; i++)
		{
			for(int j=0; j<num.length; j++)
			{
				
			int sumCheck=num[i]+num[j];
			
			
			if(sumCheck == targetNum)
			{
				num1= num[i];
				num2= num[j];

				break;
			}
			
			}
			
			
		}
		
		
		System.out.println( " given numbers "+num1+", "+num2);
		
	}
	
	
	
	public static void main(String[] args) {
	
		TestCodeHere pp= new TestCodeHere();
		pp.checkTwoSum(78);
		
	}
	
}
