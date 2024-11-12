package Java8Featurs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo7_MaxMinNumberFind {

	
	
	public static void main(String[] args) {
		
		
		List<Integer> list= Arrays.asList(2,234,435,234,53,22,452,324,832,53,2,234,452);
		
	int maxNum=	list.stream().max(Comparator.comparing(Integer::valueOf)).get();
	
	int miniNumber=list.stream().min(Comparator.comparing(Integer::valueOf)).get();

	
	System.out.println("MaximumNumber :"+maxNum);
	System.out.println("MinimumumNumber :"+miniNumber);
	}
}
