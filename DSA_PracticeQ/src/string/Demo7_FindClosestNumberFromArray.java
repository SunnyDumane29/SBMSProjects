package string;

import java.util.Arrays;

public class Demo7_FindClosestNumberFromArray {
	
	
	public void checkClosestNumberfromArray()
	{
		int[] myArray = {19, 50, 99, 7, 88, 14, 65};
		
        Arrays.sort(myArray);

        int minDiff = Integer.MAX_VALUE;
        
        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i < myArray.length; i++) {
        	
            int diff = myArray[i] - myArray[i - 1];
            
            if (diff < minDiff) {
            	
                minDiff = diff;
                num1 = myArray[i - 1];
                num2 = myArray[i];
            }
        }

        // Print the closest numbers
        System.out.println("The closest numbers are: " + num1 + " and " + num2);
        System.out.println("Diffrence of closest number is :"+minDiff);
    
		
	}
	
	public static void main(String[] args) {
		
		Demo7_FindClosestNumberFromArray pp= new Demo7_FindClosestNumberFromArray();
		
		pp.checkClosestNumberfromArray();
		
	}

}
