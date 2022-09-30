package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BaseAspect {

	// pointcut'larin tutuldugu base class
	@Pointcut(value = "execution (* com.aop.dao.*.*(..))")
	public void forDaoPackage() {

	}

	@Pointcut(value = "execution (* com.aop.dao.*.get*(..))")
	public void getter() {

	}

	@Pointcut(value = "execution (* com.aop.dao.*.set*(..))")
	public void setter() {

	}

	@Pointcut(value = "forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter() {

	}
}
