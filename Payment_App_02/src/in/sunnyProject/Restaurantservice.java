package in.sunnyProject;

public class Restaurantservice {

	IPayment payment;
	
	public Restaurantservice (IPayment payment)
	{
		this.payment= payment ;
	}
	
	public void setPayment (IPayment payment)
	{
		this.payment = payment;
	}
	
	public void collectbill(double amt)
	{
		boolean status= payment.payBill(amt);
		if (status)
		{
			System.out.println("payment succsedd");
		}
		else {
			System.out.println("Card Decliened ..");
		}
	}
	
}
