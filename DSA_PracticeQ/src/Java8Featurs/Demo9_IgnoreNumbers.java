package Java8Featurs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo9_IgnoreNumbers {

	
	public static void main(String[] args) {
	
		List<Integer> list= Arrays.asList(2,234,435,234,53,22,452,324,832,53,2,234,452);
		
		List <Integer> firstFiveEle=list.stream().limit(5).collect(Collectors.toList());
		
		int SummOfFirstFive=list.stream().limit(5).reduce((p,q) -> p+q).get();
		
		List <Integer> firstFiveEleIgnored=	list.stream().skip(5).collect(Collectors.toList());
		
		int SummOfFirstFiveIgnerd = list.stream().skip(5).reduce((p,q) -> p+q).get();
		
		
		System.out.println(firstFiveEle);
		System.out.println(SummOfFirstFive);
		System.out.println(firstFiveEleIgnored);
		System.out.println(SummOfFirstFiveIgnerd);
		

		
	}
	
}
