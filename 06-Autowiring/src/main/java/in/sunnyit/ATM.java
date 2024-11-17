package in.sunnyit;

public class ATM {

	
	private IPrinter printer;
	
	public ATM ()
	{
		System.out.println("ATM class :: 0-param constructor");
	}
	
	public ATM (IPrinter printer)
	{
		System.out.println("ATM class :: 1-param constructor");
		this.printer=printer;
		
	}
	
	public void setPrinter(IPrinter printer)
	{
		this.printer=printer;
	}
	
	public void withdraw()
	{
		System.out.println("Withdraw is completed......");
		printer.print();
	}
}
