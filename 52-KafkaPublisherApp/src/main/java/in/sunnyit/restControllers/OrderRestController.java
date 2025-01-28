package in.sunnyit.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sunnyit.binding.Order;
import in.sunnyit.service.OrderService;

@RestController
public class OrderRestController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping (value ="/order")
	public String placeOrder(@RequestBody Order order)
	{
		return orderService.createOrder(order);
		
		
	}

}
