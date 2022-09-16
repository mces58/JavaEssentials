package com.spring;

public class FootballDAO implements SportDAO {

	@Override
	public void doSportsDaily() {
		System.out.println("Gunluk futbol oyna");
	}

}
