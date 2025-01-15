package in.sunnyit.filters;

import java.util.List;
import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class MyFilter implements GlobalFilter
{

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain)
	{
		System.out.println("Filter is executed");
		
		ServerHttpRequest request = exchange.getRequest();
		
		HttpHeaders headers = request.getHeaders();
		Set<String> keySet = headers.keySet();
		
		
		boolean isValid= true;
		
		if (!keySet.contains("token"))
		{
			throw new RuntimeException("Invalid Request");
		}
		
		
		List<String> listToken = headers.get("token");
		
		if (!(listToken.get(0).equals("sunnyit@1234")))
		{
			throw new RuntimeException("Invalid Tocken passed");
		}
		
		// printinh all headers
		keySet.forEach(key -> {
			List <String> values = headers.get(key);
			System.out.println(key + " :: "+values);
		});
		
	
		
		System.out.println("=================================================================");
		
		return chain.filter(exchange);
	}

}
