package string;

import java.util.Arrays;

public class Demo8_TwoSum {
	
	
	public void checkTwoSum(int targetNum)
	{
		int [] num = {2,4,6,18,2,54,34,76};
		
		Arrays.sort(num);
		
		int num1 = 0;
		int num2 = 0;
		
		for(int i=0; i<num.length-1; i++)
		{
			
			int sumCheck=num[i]+num[i+1];
			
			System.out.println("First Numb:"+num[i]);
			System.out.println("second num :"+num[i+1]);
			System.out.println(">>>>>"+sumCheck);
			
			if(sumCheck == targetNum)
			{
				
				num1= num[i];
				num2= num[i+1];
				
				System.out.println("First Number Index :"+Arrays.binarySearch(num, num[i]));
				System.out.println("Second Number Index :"+Arrays.binarySearch(num, num[i+1]));

				break;
			}
			
			
			
		}
		
		
		System.out.println( " given numbers "+num1+", "+num2);
		
	}

	public static void main(String[] args) {
		Demo8_TwoSum pp= new Demo8_TwoSum();
		pp.checkTwoSum(78);
	}
	
}
