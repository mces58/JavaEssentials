package com.spring;

import org.springframework.stereotype.Component;

@Component(value = "database")
//component'i class'in basina yazariz. bu ifade sayesinde xml dosyasina 
//bean yazmaya gerek kalmadi parantez icinde database verdik cunku main'de 
//database verdigimiz icin herhangi bir ad verilebilir main'dekiye ayni 
//olmak sartiyla database sadece nesne adidir

//bu class'ta vermis oldugumuz component'i baska class'ta da verseydik hata 
//alirdik ayni anda iki class'ta olmamali oracle ile calismak istiyorsan 
//bu annotation'u oracle'in basina yazman gerek

//onceki projelerde application.context'te hep bean yazmistik annotation 
//ile bu bean yazma yukundende kurtuluyoruz
public class MsSqlCustomerDAO implements CustomerDAO {

	@Override
	public void insert() {
		System.out.println("Ms sql eklendi");

	}

}
