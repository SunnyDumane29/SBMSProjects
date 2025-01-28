package in.sunnyit.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;

import in.sunnyit.binding.Order;
import in.sunnyit.constants.AppConstatnts;

@Configuration
public class KafkaConsumerConfig {
	
	
	@Bean
	public ConsumerFactory<String, Order> consumerFactory()
	{
		Map <String, Object> confifProp= new HashMap<>();
		
		confifProp.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConstatnts.Host);
		
		confifProp.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		
		confifProp.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserialize.class);
		
		return new DefaultKafkaConsumerFactory<>(confifProp);
		
	}
	
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, Order> kafkaListener()
	{
		ConcurrentKafkaListenerContainerFactory<String,Order> factory =new ConcurrentKafkaListenerContainerFactory<>();
		
		factory.setConsumerFactory(consumerFactory());
		
		return factory;
		
		
	}

}
