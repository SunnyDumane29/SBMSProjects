
package StreamApi;

import java.util.Arrays;

public class Practice {

	
	public static void main(String[] args) {
		
		int  [] num= {2,34,2,45,1,23,34};
		
		int firstNnum=0;
		int secNum=0;
		
		
		for (int i = 1; i < num.length-1; i++) {
			
			for (int j = i+1; j < num.length; j++) {
				
				int summ= num[i]+num[j];
				
				if (summ == 46)
				{
					firstNnum=num[i];
					secNum=+num[j];
					
				}
				
			}
			
		}
		
		
		System.out.println("Numbers :"+firstNnum+","+secNum);
	
		
	}
}
