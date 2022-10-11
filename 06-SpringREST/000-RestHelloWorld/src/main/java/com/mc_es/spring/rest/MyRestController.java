package com.mc_es.spring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// RestController ise @Controller ve @ResponseBody’nin birlesiminden 
// olusan bir streotype. Dolayli olarak da @Controller uzerinden 
// @Component notasyonunu da barindiriyor. @Controller notasyonunun 
// aksine @RestController datanin kendisini JSON veya XML formati 
// ile direkt olarak sunabiliyor
@RestController
@RequestMapping("/test")
// @RequestMapping annotasyonu /test gibi URL'lerin bir sinif veya metod 
// tarafindan map edilmesini saglar. Sinif uzerinde kullanildigi zaman, 
// o sinifin belirtilen URL ile ilgili tum isleri yapmasi saglanir. 
// Metod uzerinde kullanildigi zaman daha spesifik URL'ye gore islem 
// yapilmasi saglanmis olur.
public class MyRestController {

	// @GetMapping bir metot seviyesinde haritalandirma yapar
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
}
