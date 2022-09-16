package com.spring;

public class TennisDAO implements SportDAO {

	@Override
	public void doSportsDaily() {
		System.out.println("Gunluk tenis oyna");
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
