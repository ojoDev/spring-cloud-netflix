package com.ojodev.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange-service", url = "localhost:8000") //Version sin Ribbon, que no balancea carga
//@FeignClient(name = "currency-exchange-service")  //Version con Ribbon, que balancea carga
@FeignClient(name = "netflix-zuul-api-gateway-server") //Version con Zuul, que es el proxy que llamará a Ribbon
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

	//@GetMapping("/currency-exchange/from/{from}/to/{to}")  //Versión apuntando al servicio
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}") //Versión apuntando al servicio a través de Zuul
	public CurrencyConversionBean retrieveExchangeValue
	(@PathVariable("from") String from, @PathVariable("to") String to);
}
