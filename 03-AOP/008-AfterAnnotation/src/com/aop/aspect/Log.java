package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {

	// after anatasyonunda ise afterReturning ile afterThrowing birlesmis gibi
	// dusunebilirsin. Ana metotda hata olsun veya olmasin, return degerleri olsun
	// veya olmasin after anatasyonu ana metot calistiktan sonra calisir
	@After(value = "execution (* com.aop.business.*.*(..))")
	public void after() {
		System.out.println("After calisti");
	}

}
