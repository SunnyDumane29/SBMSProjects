package string;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeu {
	
	
	
	
	
	public static void main(String[] args) {
		
		Deque<Integer> arrDequeu= new ArrayDeque<>();
		Deque<Integer> linkedDeueu=new LinkedList<>();
		
		
		//Add Operation
		arrDequeu.add(5); // Added elemnt at the end of theDequeu
		
		arrDequeu.offerFirst(8); //Add ath tte biginning
		arrDequeu.addFirst(9);// added at the Biginning
		
		arrDequeu.offerLast(6);// added at the last
		arrDequeu.addLast(4);// Aded at the Last
		
		System.out.println(arrDequeu);
		System.out.println("Size print :"+arrDequeu.size());
		
		arrDequeu.peek();
		arrDequeu.peekFirst(); // Print the first element of the dequeu but dosent remove it
		arrDequeu.peekLast();
		
		//remove operation
		arrDequeu.poll(); // Remove and return the elemnt from front
		arrDequeu.pollFirst();
		arrDequeu.pollLast();
		
		
		
	}

}
