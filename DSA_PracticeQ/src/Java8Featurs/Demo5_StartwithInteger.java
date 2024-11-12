package Java8Featurs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo5_StartwithInteger {

	
	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(2,234,435,234,53,22,452,324,832,22,2);
		
		List<Integer>filterdValue=list.stream()
				                   .map(e -> String.valueOf(e))
		                            .filter(e -> e.startsWith("2"))
		                               .map(Integer :: valueOf)
		                                 .collect(Collectors.toList());
		
		
		System.out.println("Starts with 2 :"+filterdValue);
	}
}
