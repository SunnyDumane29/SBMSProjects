package in.sunny.beans;

import org.springframework.stereotype.Component;

@Component("chip64")
public class Chip64Bit implements IChip {

	
	public Chip64Bit ()
	{
		System.err.println("Chip64Bit :: 0-Param Constroctor");
	}
	@Override
	public boolean process() {

		System.out.println("Chip 64 Bit Processing Started ......");
	return true;
	
	}

}
