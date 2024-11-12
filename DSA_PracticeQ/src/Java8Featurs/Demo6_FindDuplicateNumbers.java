package Java8Featurs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo6_FindDuplicateNumbers {
	
	
	public static void main(String[] args) {
	
		List<Integer> list= Arrays.asList(2,234,435,234,53,22,452,324,832,53,2,234,452);
		
		List<Integer>DuplicateList=list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toList());

				System.out.println("Duplicate Numbers :"+DuplicateList);
		
	}

}
