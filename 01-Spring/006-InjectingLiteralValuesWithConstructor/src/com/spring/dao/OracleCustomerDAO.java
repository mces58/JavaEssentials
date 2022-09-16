package com.spring.dao;

public class OracleCustomerDAO implements CustomerDAO {
	// Oracle insert isleminin kodlari yazilir.

	private String connectionString;
	private int year;

	// ayni aciklamalar
	// oracle icinde gecerli mySql icinde msSql icinde
	/*
	 * bir onceki projede field'lara setter ile deger atamistik lakin biz
	 * constructor'dan da deger atayabiliriz aralarinda pek fark yok
	 * application.context'te property ile deger atarken simdi constructor arg ile
	 * deger atayacagiz
	 */

	public OracleCustomerDAO(String connectionString, String year) {
		this.connectionString = connectionString;
		this.year = Integer.valueOf(year);
		// application.context'ten deger atarken yine year'a String tipinde
		// atanmaktadir burada da type cast yaparak int'e ceviriyoruz
	}
	/*
	 * simdi burada int icin farkli bir durum var aciklayalim biz
	 * application.contex'ten deger atarken bu degerleri string tipinde atiyoruz
	 * yani year application.contex'te string tipinde iken burada int tipinde
	 * dolayisiyla bir type cast(tip donusumu) yapmaliyiz.Year disaridan String
	 * tipinde geliyor yani setYear'daki parametre String tipinde olmalidir
	 */

	@Override
	public void insert() {
		System.out.println("Connection string: " + connectionString);
		System.out.println("year: " + year);
		System.out.println("Oracle eklendi");

	}

}
