package in.sunnyit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("chip32")
@Primary
public class Chip32Bit implements IChip {

	public Chip32Bit ()
	{
		System.out.println("Chip32Bit :: 0-param Constructor");
	}
	
	public boolean process() {


		System.out.println("Chip32Bit Processing started......");
		
		return true;
		
	}

}
