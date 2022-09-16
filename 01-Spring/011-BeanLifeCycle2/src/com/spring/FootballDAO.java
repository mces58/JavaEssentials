package com.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class FootballDAO implements SportDAO, InitializingBean, DisposableBean {

	@Override
	public void doSportsDaily() {
		System.out.println("Gunluk futbol oyna");
	}

	@Override
	public void myInit() {
		System.out.println("myInit metot calisti");
	}

	@Override
	public void myDestroy() {
		System.out.println("myDestroy metot calisti");
	}

	// hazir metotlar

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Hazir init metot calisti");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Hazir destroy metot calisti");
	}

}
