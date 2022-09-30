package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {

	// afterThrowing metot calisken hata durumlarini yakalayip log tutmamiza fayda
	// saglar
	// throwing = "exception" ile Exception exception isimlerinin ayni olmasi
	// gerekir
	@AfterThrowing(pointcut = "execution (* com.aop.business.Manager.findProduct(*))", throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Exception exception) {

		System.out.println("Pointcut ifadesi: " + joinPoint);

		Signature signature = joinPoint.getSignature();
		System.out.println("Metodun imzasi: " + signature.getDeclaringTypeName());

		System.out.println("Hata: " + exception);

	}

}
