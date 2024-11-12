package Java8Featurs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo8_SortingNumber {
	
	public static void main(String[] args) {
		
		
		List<Integer> list= Arrays.asList(2,234,435,234,53,22,452,324,832,53,2,234,452);
		
		List<Integer> AscendingOrdr=list.stream().sorted().collect(Collectors.toList());
		
		List<Integer> DecendingOrdr=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		
		System.out.println("Ascending Order :"+AscendingOrdr);
		System.out.println("Decending Order :"+DecendingOrdr);

	}

}
