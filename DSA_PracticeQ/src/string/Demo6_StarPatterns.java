package string;

public class Demo6_StarPatterns {
	
	
	public void startPatters_Example1()
	{
		int row=6;

		for (int i=0; i<row; i++)
		{
			for (int j=0; j<=i; j++)
			{
				
				System.out.print("*");
			}
			
			System.out.println("");

		}
		
	}
	

	
	public static void main(String[] args) {
		
		Demo6_StarPatterns pp= new Demo6_StarPatterns();
		
		pp.startPatters_Example1();
		
	}
	
}
