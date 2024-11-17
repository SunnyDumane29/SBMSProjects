package List_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo9_IMP {

	// how to take dynamic data 
	// use scannerclass method 
	
	
	public static void main(String[] args) {
		
		ArrayList <String> al= new ArrayList<String>();
		
	for(int i= 1; i<=5; i++)
	{
		System.out.println("enter your Mobile Number");
		
		Scanner scr= new Scanner(System.in);
		
		String mobilenum = scr.next();
		
		al.add(mobilenum);
		
	}
System.out.println("withput Iteration All element :"+al);	
	
	
	// iterate using enhanced fror loop 
	for(String st:al)
	{
		System.out.println("By Iteration Using enhanced For loop :"+st);
	}
		
	}
	
}
