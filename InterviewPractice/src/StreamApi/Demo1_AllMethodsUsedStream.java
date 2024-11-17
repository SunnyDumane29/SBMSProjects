package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1_AllMethodsUsedStream {

	
	
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,3,4,5,3,3452,56,1,0,34,4,2,78,45,2,4);
		
		//The map method is used to return a stream consisting of the results 
		//of applying the given function to the elements of this stream.
		
		//Get Map
		List<Integer> squre =number.stream().map(e -> e*e ).collect(Collectors.toList());
		System.out.println("map which which gives Each elemnt Squre:"+squre);
		
		//Filters
		List<Integer> ElemntAbove =number.stream().filter(e -> e >4).collect(Collectors.toList());
		System.out.println("Filter Elemnt which are above 5 :"+ElemntAbove);

		List <String>names = Arrays.asList("Reflection","Collection","Stream","Sunny","Ramesh");
		List <String>strResult = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		System.out.println("Filter String Elemnt which are start with S:"+strResult);

		
		
		
		
		
		
		//-----------------------------------------------------------------------------------------
		
		List <Employee> emp= new ArrayList<Employee>();
		emp.add(new Employee(1232,"Sunny","Pune"));
		emp.add(new Employee(5643,"ASD","PBN"));
		emp.add(new Employee(7645,"JHG","BID"));
		emp.add(new Employee(8734,"SDE","SATARA"));
		emp.add(new Employee(8765,"IHG","KARAD"));
		emp.add(new Employee(6757,"OIU","MUMBAI"));
		emp.add(new Employee(9843,"RFG","THANE"));
		
		List<Employee> sortedEmp = emp.stream().sorted(Comparator.comparingInt(Employee::getID)).collect(Collectors.toList());
		
		sortedEmp.forEach(System.out::println);

		
		
		
	}
}
