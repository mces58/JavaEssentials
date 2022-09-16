package com.spring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
// @Scope("singleton")
// onceden xml dosyasindan belirtigimiz scope ozelligini 
// simdi anatasyon ile belirtiyoruz
public class FootballDAO implements SportDAO {

	@Override
	public void doSportsDaily() {
		System.out.println("Gunluk futbol oyna");
	}

}
