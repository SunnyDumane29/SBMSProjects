package Java8Featurs;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Demo2_CalculateAvrageofAllNumbers implements Cloneable {
	
	public static void main(String[] args) {
		
		List <Integer> sumEle= Arrays.asList(1,2,3,4,4,6,7,8,9,10);
		double avg =sumEle.stream().mapToInt(e -> e).average().getAsDouble();
		
		System.out.println("print average is :"+avg);
		
	}

}
