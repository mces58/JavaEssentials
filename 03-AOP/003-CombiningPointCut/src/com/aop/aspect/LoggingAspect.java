package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // Bu class'in aspect oldugunu oyluyoruz
@Component
public class LoggingAspect {

	// mantiksal ifadeleri kullanarak kombibanasyonlar olusturabiliriz.
	// && = ve
	// || = veya
	// ! = degili

	// hepsi dahil
	@Pointcut(value = "execution (* com.aop.dao.*.*(..))")
	private void forDaoPackage() {

	}

	// getter icin
	@Pointcut(value = "execution (* com.aop.dao.*.get*(..))")
	private void getter() {

	}

	// setter icin
	@Pointcut(value = "execution (* com.aop.dao.*.set*(..))")
	private void setter() {

	}

	// hepsinden dahil lakin getter ve setter haric
	@Pointcut(value = "forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetterSetter() {

	}

	// calistir
	@Before(value = "forDaoPackageNoGetterSetter()")
	public void beforeAddAccount() {
		System.out.println("before calisti.");
	}
}
