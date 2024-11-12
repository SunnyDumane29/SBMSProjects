package in.sunny.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Robot {
	
	@Autowired
	//@Qualifier("chip64")
	private IChip chip;
	
	
	public Robot()
	{
		System.out.println("Robot :: 0-Param Constructor");
	}
	
	public Robot(IChip chip)
	{
		System.out.println("Robot :: 1-Param Constructor");
		
		this.chip=chip;
	}

	public void dowork() 
	{
		System.out.println("Injected :: "+chip.getClass().getName());
		boolean status = chip.process();
		
		if(status)
		{
			System.out.println("Robot is working....");
		}
		else {
			System.out.println("Robot having some fault....");
		}
	}

}
