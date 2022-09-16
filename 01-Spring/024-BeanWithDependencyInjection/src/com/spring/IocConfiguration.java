package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.business.CustomerManager;
import com.spring.business.CustomerService;
import com.spring.dao.CustomerDAO;
import com.spring.dao.MsSqlCustomerDAO;

@Configuration
public class IocConfiguration {

	// normal bean tanimlama
	@Bean
	public CustomerDAO database() {
		return new MsSqlCustomerDAO();
	}

//	Onceki projelerimizde CustomerManager class'i vardi simdi burada da 
//	CustomerManager	class'i olusturduk ve xml dosyasinda yaptigimiz gibi 
//	burada da constructor injection yaptik.CustomerManager class'imiz bir 
//	constructor'i var ve bir CustomerDAO(MySql veya MsSql) istiyor. 
//	parametre olarak yukarida olusturdugumuz database() fonksiyonunu 
//	cagisiyoruz cunku database fonksiyonu bizim icin bir CustomerDAO uretiyor 
//	boylece bagimliliklari tek bir noktadan	yonetiyoruz soyle yapsaydik yine olmazdi 
//	return new CustomerManager(new MsSqlCustomerDal()); 
//	cunku sistemi MySql'e cevirmek istedigimizde hem database hemde service 
//	fonksiyonunda degisiklik yapmak zorunda kalacaktik onun yerine service 
//	fonksiyonuna database fonksiyonunu gondererek sadece database'de degisiklik
//	yapacagiz. Bu yapiya da bean ile dependency injection denir.

	@Bean
	public CustomerService service() {
		return new CustomerManager(database());
	}
}
