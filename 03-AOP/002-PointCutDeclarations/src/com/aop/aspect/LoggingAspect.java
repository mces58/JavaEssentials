package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // Bu class'in aspect oldugunu oyluyoruz
@Component
public class LoggingAspect {

	// pointcut ile ifadeyi merkezi bir yerde tutuyoruz boylece
	// bir degisim oldugu zaman merkezi yeri degistirmek yeterli oluyor.
	// tekrarli kullanimlari sagliyor.
	@Pointcut(value = "execution (* com.aop.dao.*.*(..))")
	private void forDaoPackage() {

	}

	@Before(value = "forDaoPackage()")
	public void beforeAddAccount() {
		System.out.println("Before anatasyonu calisti. " + getClass());
	}

	@Before(value = "forDaoPackage()")
	public void ikinciFonksiyon() {
		System.out.println("Herhangi bir sey. " + getClass());
	}
}
