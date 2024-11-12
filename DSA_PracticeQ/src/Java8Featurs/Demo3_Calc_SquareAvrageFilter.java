package Java8Featurs;

import java.util.Arrays;
import java.util.List;

public class Demo3_Calc_SquareAvrageFilter {
	
	/* we have A list of of Number =1,10,20,30,15
	 * 
	 * - find the square of each element
	 * - filter the elemnt which is greater than 100
	 * - then calculate the avrage of filterd value 
	 * 
	 * */
	
	
	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(1,10,20,30,15);
		
		double avg=list.stream()
				.map(e -> e)     // this is from stream class itterate each elemnt 
				.mapToInt(e -> e*e)
				.filter(e -> e>100)
				.average()
				.getAsDouble();
		
		System.out.println(avg);
		
	}

}
