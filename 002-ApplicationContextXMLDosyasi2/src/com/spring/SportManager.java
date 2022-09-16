package com.spring;

public class SportManager {
	private SportDAO sportDAO;

	public SportManager(SportDAO sportDAO) {
		this.sportDAO = sportDAO;
	}

	public void doSportsDaily() {
		sportDAO.doSportsDaily();
	}
}
