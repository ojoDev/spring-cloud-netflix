package com.ojodev.microservices.netflixzuulapigatewayserver;



import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

	@Component
	public class ZuulLogginFilter extends ZuulFilter {
		
		private Logger logger = LoggerFactory.getLogger(this.getClass());
	
		@Override
		public Object run() {
			HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
			logger.info("request -> {} request uri -> {}", request,  request.getRequestURI());
			return null;
		}
	
		// Dice si el filtro se ejecuta o no
		@Override
		public boolean shouldFilter() {
			return true;
		}
	
		//Orden en que se aplican los filtros
		@Override
		public int filterOrder() {
			return 1;
		}
	
		// Cuando se ejecuta el filtro:
		// "pre" -> Antes de ejecutarse la request
		// "post" -> Después de ejecutarse la request
		// "error" -> Cuando la request da error
		@Override
		public String filterType() {
			return "pre";
		}
	
	}
