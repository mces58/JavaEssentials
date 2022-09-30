package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(value = 1)
public class CloudLoggingAspect {

	@Before(value = "com.aop.aspect.BaseAspect.forDaoPackageNoGetterSetter()")
	public void beforeAddAccount(JoinPoint joinPoint) {
		System.out.println("before cloud icin calisti." + getClass());
		Signature methodSignature = joinPoint.getSignature();
		// MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		// ikiside ayni

		System.out.println("Metot: " + methodSignature);
		// joinPoint ile ana metodun bilgilerine ulasabiliriz

		Object[] args = joinPoint.getArgs();// parametreleri dizi seklinde aldik
		for (Object temp : args) {
			System.out.println(temp);
		}
	}
}
