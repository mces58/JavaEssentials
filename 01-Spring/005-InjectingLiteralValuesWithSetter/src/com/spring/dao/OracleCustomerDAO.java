package com.spring.dao;

public class OracleCustomerDAO implements CustomerDAO {
	// Oracle insert isleminin kodlari yazilir.

	private String connectionString;
	private int year;

	// ayni aciklamalar
	// oracle icinde gecerli mySql icinde msSql icinde
	/*
	 * normalde biz burada bir field tanimladigimizda bunu disaridan erisime
	 * kapatiriz ve bu field'lara deger atama islemlerini hep main'den yaptik
	 * main'de bu field'lara constructor veya setter'lar ile degerler atadik simdi
	 * bu projemizde aslinda bu deger atama islemini main'den degilde
	 * application.contex'tende yapabiliriz. bunu gosterecegiz
	 * 
	 * bu field'larin setter'larini yazarak bu setter'lara application.contex'ten
	 * ulasarak deger atayacagiz bunu bir onceki projemizde yine yapmistik buna
	 * setter injection denirdi.
	 */

	// getterlara suanlik ihtiyac olmadigi icin olusturmadim
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void setYear(String year) {
		this.year = Integer.valueOf(year);
	}
	/*
	 * simdi burada int icin farkli bir durum var aciklayalim biz
	 * application.contex'ten deger atarken bu degerleri string tipinde atiyoruz
	 * yani year application.context'te string tipinde iken burada int tipinde
	 * dolayisiyla bir type cast(tip donusumu) yapmaliyiz.Year disaridan String
	 * tipinde geliyor yani setYear'daki parametre String tipinde olmalidir
	 */

	@Override
	public void insert() {
		System.out.println("Connection string: " + connectionString);
		System.out.println("Year: " + year);
		System.out.println("Oracle eklendi");

	}
}
