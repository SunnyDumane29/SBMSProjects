package string;

import java.time.LocalDate;

public class Demo11_CurrentFinancialyear {

	
	public static void main(String[] args) {

		LocalDate ld= LocalDate.now();
		int finacialYesrStart;
		int financiaYearEnd;
		
		if(ld.getMonthValue() >= 4)
		{
			finacialYesrStart= ld.getYear();
			financiaYearEnd= ld.getYear()+1;
		}
		else {
			finacialYesrStart= ld.getYear();
			financiaYearEnd= ld.getYear()-1;
		}
	
		System.out.println("Finacial Year Is :"+finacialYesrStart+"-"+financiaYearEnd);
		
	}
}
