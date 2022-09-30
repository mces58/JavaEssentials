package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect // Bu class'in aspect oldugunu oyluyoruz
@Component
public class LoggingAspect {

	// before anatasyonu sayesinde addAccont metodundan once bu metot calisir.
	// bu sayede loglama, transaction gibi islemler yapilabilir.
	// value degerine pointcut expression denir
	// ileriki derslerde detayli bir sekilde islenecek
	@Before(value = "execution (public void addAccount())")
	public void beforeAddAccount() {
		System.out.println("Before anatasyonu calisti. " + getClass());
	}
}
