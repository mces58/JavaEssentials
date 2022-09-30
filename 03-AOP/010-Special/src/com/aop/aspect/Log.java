package com.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {

	// kendimiz bir anatasyon olusturduk ve onun burada lokasyon bilgisini verdik
	@Around(value = "@annotation(com.aop.aspect.LogAnnotation)")
	public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {

		try {
			System.out.println("Around basladi: " + proceedingJoinPoint);

			proceedingJoinPoint.proceed();

			System.out.println("Around bitti: " + proceedingJoinPoint);
		} catch (Throwable e) {
			System.out.println("Hata: " + e);
		}
	}
}
