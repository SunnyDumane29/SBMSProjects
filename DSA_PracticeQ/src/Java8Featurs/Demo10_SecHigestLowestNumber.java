package Java8Featurs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo10_SecHigestLowestNumber {

	
	public static void main(String[] args) {
		
		
		List<Integer> list= Arrays.asList(2,234,435,234,53,22,452,324,832,53,2,234,452);

		int secondHigh= list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		
		
		int secondLowest=list.stream().sorted().distinct().skip(1).findFirst().get();
		
		System.out.println("Second Highest :"+secondHigh);
		System.out.println("Second Lowest :"+secondLowest);
		
		
		
		
	}
	
}
