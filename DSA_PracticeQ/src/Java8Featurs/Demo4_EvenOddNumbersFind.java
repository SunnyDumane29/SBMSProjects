package Java8Featurs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo4_EvenOddNumbersFind {

	
	
	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(11,2,3,45,67,9,90,47,88,8,2,0);
		
		List<Integer>evenNum=list.stream().filter(e -> e%2 ==0).collect(Collectors.toList());
		

		List<Integer> oddNum=list.stream().filter(e -> e%2 !=0).collect(Collectors.toList());
		
		System.out.println("Odd numbers :"+oddNum);
		System.out.println("Even number :"+evenNum);
		
	}
	
	
}
