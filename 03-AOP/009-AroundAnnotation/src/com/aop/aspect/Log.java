package com.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {

	// within tum metotlari kapsar
	// yani business class'indaki tum metotlar icin bir pointCut ifadesidir
	@Pointcut(value = "within (com.aop.business.*)")
	private void pointCut() {

	}

	// around metottan hem once hemde sonra calismasi icin kullanilir
	// around metotdan once calismayi baslatir
	// ProceedingJoinPoint ise de ana metodun isi bittikten sonra yapilacak
	// islemler icin kullanilir. Yani bir nevi after gibidir
	@Around(value = "pointCut()")
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
