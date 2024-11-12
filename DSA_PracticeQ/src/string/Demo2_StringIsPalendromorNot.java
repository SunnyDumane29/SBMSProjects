package string;

public class Demo2_StringIsPalendromorNot {

	// String is Palendrom or no 
	// get String cceck its reversed as same as given String 
	
	
	public void palendromString(String givnString)
	{
		char [] ch=givnString.toCharArray();
		String revStr="";
		
		for(int i=ch.length-1; i >= 0; i--)
		{
			revStr= revStr+ch[i];
		}
		
		if (revStr.equalsIgnoreCase(givnString))
		{
			System.out.println("String is palendrom :"+revStr);
		}
		else {
			System.out.println("String is not palendrom :"+revStr );
		}
		
	}
	
	public static void main(String[] args) {
		
		Demo2_StringIsPalendromorNot pp= new Demo2_StringIsPalendromorNot();
		
		pp.palendromString("ana");
		
	}
	
}
