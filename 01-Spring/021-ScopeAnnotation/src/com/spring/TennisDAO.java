package com.spring;

import org.springframework.stereotype.Component;

@Component
public class TennisDAO implements SportDAO {

	@Override
	public void doSportsDaily() {
		System.out.println("Gunluk tenis oyna");
	}

}
