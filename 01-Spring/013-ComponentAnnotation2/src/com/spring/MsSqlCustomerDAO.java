package com.spring;

import org.springframework.stereotype.Component;

@Component
/*
 * bir onceki projede component'te bir value degeri vermistik lakin istersek
 * boylece kullanabiliriz. Bu kullanima default component denir. Boyle
 * kullanabilmek icin main'de component'ti hangi class'ta kullaniyorsan o
 * class'in adini vererek kullanmalisin bir dikkat etmen gereken husus camel
 * casing olayi yani main'de kullanirken class'in ilk harfi kucuk olup geri
 * kalanin oldugu gibi yazilmasi
 */
public class MsSqlCustomerDAO implements CustomerDAO {

	@Override
	public void insert() {
		System.out.println("Ms sql eklendi");

	}

}
