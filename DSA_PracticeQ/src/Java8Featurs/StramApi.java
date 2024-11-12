package Java8Featurs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StramApi {
	
	
	  //(int a,int b) -> {System.out.println("Summation is :"+a+b)};
	  //(int a, int b) -> {System.out.println(a+b);}
//	  (p) -> System.out.println("One parameter: " + p);
//	
	public void checkaboveElemnt()
	{
//		int[] arr = {6, 5, 3, 2, 7, 9, 1};
//		Arrays.stream(arr);
//		
//		Stream s1= Stream.of(arr);
//		s1.filter(p -> p < 5).map(p);
		
		ArrayList<Integer> cars = new ArrayList<Integer>();
		
		
	   
	}
	
	
	
	public static void main(String[] args) {
		
		
		int[] intArray = { 1,2,3,4,5,6,7,8,9,10 };
		Arrays.stream(intArray).filter(x -> x > 5).forEach(System.out::println);
		
		//int[] intArray = { 1,2,3,4,5,6,7,8,9,10 };
		
//	IntStreamst =Arrays.stream(intArray);
	IntStream stream = Arrays.stream(intArray); 
		
		//intArray.stream().filter(e -> e > 6).collect(Collectors.toList());
		
		// System.out.println("Filter usimh" +chek);
		 
		List<Integer> Id = new ArrayList<Integer>();  
		Id.add(101);
		Id.add(424);
		Id.add(254);
		Id.add(436);
		Id.add(345);
		Id.add(723);
		Id.add(165);
		Id.add(377);
		Id.add(235);
		Id.add(873);
		Id.add(235);
		

        List<Integer> filteredList = Id.stream()
                                       .filter(i -> i > 300)
                                       .collect(Collectors.toList());
        
        System.out.println("Filter usimh" +filteredList);
		
		// List<Integer> productPriceList2 =Id.stream().filter(p -> p < 300).collect(Collectors.toList());
				   // .collect(Collector.of(Id));
		 
//                 .filter(p -> p.price < 30000)// filtering data  
//                 .map(p->p.price)        // fetching price  
//                 .collect(Collectors.toList()); // collecting as list  

		
		
		
		List<Products> productsList = new ArrayList<Products>();  
		
        //Adding Products  
        productsList.add(new Products(1,"HP Laptop",25000));  
        productsList.add(new Products(2,"Dell Laptop",30000));  
        productsList.add(new Products(3,"Lenevo Laptop",28000));  
        productsList.add(new Products(4,"Sony Laptop",28000));  
        productsList.add(new Products(5,"Apple Laptop",90000)); 
        
        
        List<Integer> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price < 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        
       // arr.stream(p -> p > 5000).filter().colllect(Collect.toList());
        
        //List<Integer> productPriceList3 =productsList.stream().filter( p -> p.price < 30000).map(p -> p.price).collect(Collectors.toList());
        
//                .filter(p -> p.price < 30000)// filtering data  
//                .map(p->p.price)        // fetching price  
//                .collect(Collectors.toList()); // collecting as list  
        
        System.out.println("Stream api in java ");
        System.out.println(productPriceList2);  
	}

}
