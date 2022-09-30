package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(value = 3) // order ile aspect'in calisma sirasini belirleyebiliyoruz
public class SmsLoggingAspect {

	@Before(value = "com.aop.aspect.BaseAspect.forDaoPackageNoGetterSetter()")
	public void beforeAddAccount() {
		System.out.println("before sms icin calisti." + getClass());
	}
}
