package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// @Scope("prototype")
public class SportManager {
	private SportDAO sportDAO;

	@Autowired
	public SportManager(@Qualifier(value = "footballDAO") SportDAO sportDAO) {
		this.sportDAO = sportDAO;
	}

	public void doSportsDaily() {
		sportDAO.doSportsDaily();
	}
}
