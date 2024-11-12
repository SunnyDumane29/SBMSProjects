package Java8Featurs;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo11_CountOf {

	
	public void charCount()
	{
        Character[] array = {'a', 'b', 'a', 'c', 'b', 'a', 'd', 'e', 'e', 'c'};
        
        Map<Character, Long> characterCounts = Arrays.stream(array)
                                               .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        
        
        characterCounts.forEach((key, value) -> System.out.println(key + " : " + value));
        
        // Print the result
//        characterCounts.forEach((character, count) -> 
//            System.out.println(character + ": " + count));
	}
	
	public void integerCount()
	{
		
		 int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

	        Map<Integer, Long> elementCount = Arrays.stream(array)
	        		                                .boxed()
	        	                                	.collect(Collectors.groupingBy(e -> e, Collectors.counting()));

	        
	        // Print the result
	        elementCount.forEach((key, value) -> System.out.println(key + " : " + value));
	}
	
	public static void main(String[] args) {
		
		Demo11_CountOf cc= new Demo11_CountOf();
		cc.charCount();
		cc.integerCount();
		
		
	}
}
