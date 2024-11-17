package in.sunnyit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Robot {

	@Autowired
	//@Qualifier("chip32")
	private IChip chip;

	
	public Robot (IChip chip)
	{
		System.out.println("Robot :: 1-param Constructor"); 
  
		this.chip=chip;
		
	}
	
	 
	public void setChip(IChip chip) {
		this.chip = chip;
	}
 


	public void doWork()
	{
		System.out.println("Injected ::"+chip.getClass().getName());
		
		boolean status = chip.process();
		
		if(status)
		{
			System.out.println("Robot is working ....");
		}
		else {
			System.out.println("Robot having fault....");
		}
	}
	
}
