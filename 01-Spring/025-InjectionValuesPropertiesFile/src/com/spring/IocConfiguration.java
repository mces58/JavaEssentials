package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.business.CustomerManager;
import com.spring.business.CustomerService;
import com.spring.dao.CustomerDAO;
import com.spring.dao.MsSqlCustomerDAO;

@Configuration
@PropertySource(value = "classpath:values.properties")
//burada xml de oldugu gibi value.properties dosyasini cagirdik 
//value.properties dosyasindaki field'lar hangi class'larda var ise 
// o classlara gidip o field'lari component yapmaliyiz
// birden fazla properties dosyan varsa onlari okumak icin:
//@PropertySources(value = { 
//		@PropertySource(value = "classpath:values.properties"),
//		@PropertySource(value = "classpath:values.properties2") })
public class IocConfiguration {

	@Bean
	public CustomerDAO database() {
		return new MsSqlCustomerDAO();
	}

	@Bean
	public CustomerService service() {
		return new CustomerManager(database());
	}
}
