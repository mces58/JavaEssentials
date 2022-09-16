package com.spring;

public class FootballDAO implements SportDAO {

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

}
