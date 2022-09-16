package com.spring;

public class TennisDAO implements SportDAO {

	@Override
	public void doSportsDaily() {
		System.out.println("Gunluk tenis oyna");
	}

}
