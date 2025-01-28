package in.sunnyit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import in.sunnyit.binding.Order;
import in.sunnyit.constants.AppConstatnts;

@Service
public class OrderService {
	
	@Autowired
	private KafkaTemplate<String, Order> kafkaTemp;
	
	
	public String createOrder(Order order)
	{
		kafkaTemp.send(AppConstatnts.Topic,order);
		
	     return "order created in kafka topuc";
	
		
	}

}
