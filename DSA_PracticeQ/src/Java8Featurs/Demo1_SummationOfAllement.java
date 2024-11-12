package Java8Featurs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo1_SummationOfAllement {

	
	public static void main(String[] args) {
		
		// int[] intArray = { 1,2,3,4,5,6,7,8,9,10 };

		List <Integer> sumEle= Arrays.asList(1,2,3,4,4,6,7,8,9,10);
		
		
		Optional<Integer>sum=sumEle.stream().reduce((a,b) -> a+b);
				
		System.out.println("Summation all :"+sum);
		
		
	}
	
}
