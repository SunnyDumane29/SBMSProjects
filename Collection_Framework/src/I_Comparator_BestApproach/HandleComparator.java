package I_Comparator_BestApproach;

import java.util.Comparator;

public class HandleComparator implements Comparator <Students>{

	@Override
	public int compare(Students std1, Students std2) {
		
		return std1.Name.compareTo(std2.Name);
		
	}

	
	
	
	
}
