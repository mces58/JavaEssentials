package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(value = 1) // order ile aspect'in calisma sirasini belirleyebiliyoruz
public class CloudLoggingAspect {

	@Before(value = "com.aop.aspect.BaseAspect.forDaoPackageNoGetterSetter()")
	public void beforeAddAccount() {
		System.out.println("before cloud icin calisti." + getClass());
	}
}
