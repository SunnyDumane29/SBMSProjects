package in.sunnyit.beans;

import org.springframework.stereotype.Component;

@Component("chip64")
public class Chip64Bit implements IChip {
	
	public Chip64Bit ()
	{
		System.out.println("Chip64Bit :: 0-Param Constructor");
	}
	

	@Override
	public boolean process() {

		System.out.println("Chip64Bit Processing Started.........");
		
		return true;
	}

}
